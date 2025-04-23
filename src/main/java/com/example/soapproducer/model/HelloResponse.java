package com.example.soapproducer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloResponse")
public class HelloResponse {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
