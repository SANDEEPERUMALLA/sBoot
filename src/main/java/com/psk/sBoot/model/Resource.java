package com.psk.sBoot.model;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
@RequestMapping("service")
public class Resource {


    @GET
    @RequestMapping("/run")
    public String invoke(){

        return "test";

    }

}
