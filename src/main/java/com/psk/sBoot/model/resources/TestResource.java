package com.psk.sBoot.model.resources;

import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/jersey")
public class TestResource {

    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Res test() throws Exception {

        Res r = new Res();
        r.setMessage("success");
        //throw new Exception("test");

        return r;

        //return "MY JERSEY APP";
    }

}

@Getter @Setter
class Res{
    String message;

}
