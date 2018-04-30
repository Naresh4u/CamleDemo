package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "routes")
@Configuration
public class ConfigurationService {

    private String port;
     private List<RouteRule> route = new ArrayList<>();

    public List<RouteRule> getRules() {
        return route;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<RouteRule> getRoute() {
        return route;
    }

    public void setRoute(List<RouteRule> route) {
        this.route = route;
    }
}