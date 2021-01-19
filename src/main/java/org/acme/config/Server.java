package org.acme.config;

import java.util.Map;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;
import io.smallrye.config.WithParentName;

@ConfigMapping(prefix = "test.quarkus.environments")
interface Server {
    @WithParentName
    Map<String, Environment> environments();
}

interface Environment {
    @WithParentName
    String name();
    
    @WithName("host")
    String host();

    @WithName("port")
    String port();
}