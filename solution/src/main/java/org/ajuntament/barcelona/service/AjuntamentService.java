package org.ajuntament.barcelona.service;

import org.ajuntament.barcelona.cache.ResultCache;
import org.ajuntament.barcelona.model.ResultsDTO;
import org.ajuntament.barcelona.solution.api.MavenApiHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjuntamentService {

    private final MavenApiHelper helper;

    @Autowired
    public AjuntamentService(MavenApiHelper helper) {
        this.helper = helper;
    }

    public ResultsDTO getResults(String language) {
        ResultsDTO results = null;
        try {
            results = ResultCache.getInstance().get(language);
            if (results != null) {
                return results;
            }
            results = helper.getResults(language);
            if (results == null) {
                return null;
            }
            ResultCache.getInstance().add(results, language);
            return results;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
