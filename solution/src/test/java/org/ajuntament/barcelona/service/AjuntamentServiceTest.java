package org.ajuntament.barcelona.service;

import org.ajuntament.barcelona.cache.ResultCache;
import org.ajuntament.barcelona.model.ResultDTO;
import org.ajuntament.barcelona.model.ResultsDTO;
import org.ajuntament.barcelona.service.AjuntamentService;
import org.ajuntament.barcelona.solution.TestParent;
import org.ajuntament.barcelona.solution.api.MavenApiHelper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AjuntamentServiceTest extends TestParent {

    AjuntamentService service;
    ResultsDTO expectedDto;

    @Before
    public void setUp() throws Exception {
        service = new AjuntamentService(new MavenApiHelper());
        createExpectedResults();
        List<ResultDTO> list = new ArrayList<>();
        list.add(expected);
        expectedDto = new ResultsDTO();
        expectedDto.setResults(list);
    }

    @Test
    public void getResultFromCacheTest() {
        expectedDto.getResults().get(0).setDescription("Came from cache");
        ResultCache.getInstance().add(expectedDto, "ca");
        ResultsDTO result = service.getResults("ca");
        assertEquals(expected.getCode(), result.getResults().get(0).getCode());
        assertEquals(expected.getUrl(), result.getResults().get(0).getUrl());
        assertEquals("Came from cache", result.getResults().get(0).getDescription());
        assertEquals(expected.getOrganization().getCode(), result.getResults().get(0).getOrganization().getCode());
    }

    @Test
    public void getResultFromApiTest() {
        ResultsDTO result = service.getResults("es");
        assertEquals(expected.getCode(), result.getResults().get(0).getCode());
        assertEquals("http://mediambient.gencat.cat/es/05_ambits_dactuacio/atmosfera/qualitat_de_laire/",
                result.getResults().get(0).getUrl());
        assertNotEquals("Came from cache", result.getResults().get(0).getDescription());
        assertEquals(expected.getOrganization().getCode(), result.getResults().get(0).getOrganization().getCode());
        assertEquals("Medio ambiente", result.getResults().get(0).getOrganization().getDescription());
        assertNotNull(ResultCache.getInstance().get("es"));
    }
}