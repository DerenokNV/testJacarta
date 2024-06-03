package org.tech.testjacarta.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

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
