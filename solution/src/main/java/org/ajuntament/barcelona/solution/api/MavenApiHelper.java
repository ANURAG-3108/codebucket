package org.ajuntament.barcelona.solution.api;

import org.ajuntament.barcelona.model.ResultsDTO;
import org.ajuntament.barcelona.parser.ResultParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class MavenApiHelper {
	
    private static final String PRIVATE_KEY = "5330d355e49bd202e20b3156e0b1221def0eff2b";
    
    private static final String PUBLIC_KEY = "ab6b3198982999015c00ad382c77bfdd";

    private static final String AJUNTAMENT_URL = "https://opendata-ajuntament.barcelona.cat/data/api/3/action/package_search";
    
    public ResultsDTO getResults(String language) {
        ResultsDTO dto = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            dto = restTemplate.getForObject(AJUNTAMENT_URL, ResultsDTO.class);
            String response = restTemplate.getForObject(AJUNTAMENT_URL, String.class);
            dto = ResultParser.parseFromJson(response, language);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        return dto;
    }

}
