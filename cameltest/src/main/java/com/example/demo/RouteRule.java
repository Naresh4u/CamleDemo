package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

 public class RouteRule {
    private String from;
    private String to;

    public RouteRule(){}

    public RouteRule( String from, String to) {
        this.from =from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

     @Override
     public String toString() {
         return "{\"RouteRule\":{"
                 + "                        \"from\":\"" + from + "\""
                 + ",                         \"to\":\"" + to + "\""
                 + "}}";
     }
 }