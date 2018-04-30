package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRoute extends RouteBuilder {


    @Autowired
    private ConfigurationService  rules;

    @Override
    public void configure() throws Exception {

        rules.getRules().forEach(x->{
            from("jetty:http://0.0.0.0:"+rules.getPort()+"/"+x.getFrom()+"??matchOnUriPrefix=true")
            .to("http4://"+x.getTo()+"?bridgeEndpoint=true&throwExceptionOnFailure=false");
            System.out.println(x);});


       //  from("jetty:http://0.0.0.0:8088/a?matchOnUriPrefix=true") .to("http4://jsonplaceholder.typicode.com/posts/?bridgeEndpoint=true&throwExceptionOnFailure=false");
     }
}