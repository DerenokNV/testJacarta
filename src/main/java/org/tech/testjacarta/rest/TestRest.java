package org.tech.testjacarta.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 */
@Path("/person")
public class TestRest {
    
  @GET  
  public Response testMethod() {
    return Response
            .status( Response.Status.OK )
            .entity( "TEST" )
            .build();  
  }
    
}
