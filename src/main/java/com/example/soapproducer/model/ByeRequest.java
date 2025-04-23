package com.example.soapproducer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ByeRequest")
public class ByeRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
