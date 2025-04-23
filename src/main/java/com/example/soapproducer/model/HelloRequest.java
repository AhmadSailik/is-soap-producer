package com.example.soapproducer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloRequest")
public class HelloRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}