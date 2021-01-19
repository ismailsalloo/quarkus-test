package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @Inject
    private Server server;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println(server.environments().get("localhost").name());
        System.out.println(server.environments().get("localhost").host());
        System.out.println(server.environments().get("localhost").port());
        return "Hello RESTEasy";
    }
}