package com.nextmovie.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movies")
public class MoviesRestService {

    @GET
    @Path("/upcoming")
    @Produces(MediaType.APPLICATION_JSON)
    public String upComingMovieRS() {
        UpComing up = new UpComing();
        return up.getComingMovies();
    }
}
