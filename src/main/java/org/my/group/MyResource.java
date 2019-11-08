package org.my.group;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyResource {

    @Inject
    private MyService myService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello"+" my name is "+myService.getName();
    }

    @Path("/demo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return "{'demo':'hello world'}";
    }
}