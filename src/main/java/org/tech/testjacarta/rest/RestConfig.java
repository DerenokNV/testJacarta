package org.tech.testjacarta.rest;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.message.GZipEncoder;
import org.glassfish.jersey.message.filtering.EntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.EncodingFilter;


/**
 *
 */
//@ApplicationPath( "/api" )
public class RestConfig extends ResourceConfig {
    
  public RestConfig() {
    packages( "org.tech.testjacarta.rest" );
    /*register( GsonProvider.class );
    register( ServiceAuditResponseFilter.class );*/
    register( EntityFilteringFeature.class );
    EncodingFilter.enableFor( this, GZipEncoder.class );
  }
    
}
