package com.nextmovie.jaxrs;

import org.apache.http.client.HttpClient;
import org.yamj.api.common.http.SimpleHttpClientBuilder;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.methods.TmdbMovies;
import com.omertron.themoviedbapi.tools.HttpTools;

public class UpComing {
    
    public String getComingMovies() {
        String result="";
        try {
            TmdbMovies instance = new TmdbMovies(getApiKey(), getHttpTools());
            result = instance.getUpcomingJson(0, null); 
        } catch (MovieDbException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    private String getApiKey() {
        return "6182f24002d3f6fbf7a13e54ae11895b";
    }
    
    private HttpTools getHttpTools() {
        
        HttpClient httpClient = new SimpleHttpClientBuilder().build();
        return new HttpTools(httpClient);
    }
}
