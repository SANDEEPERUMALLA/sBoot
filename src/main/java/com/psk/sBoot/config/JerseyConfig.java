package com.psk.sBoot.config;


import com.psk.sBoot.mappers.RootExceptionMapper;
import com.psk.sBoot.model.resources.TestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig(){
        register(TestResource.class);
        register(RootExceptionMapper.class);
    }


}
