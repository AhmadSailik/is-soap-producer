package com.example.soapproducer.service;

import com.example.soapproducer.model.ByeRequest;
import com.example.soapproducer.model.ByeResponse;
import com.example.soapproducer.model.HelloRequest;
import com.example.soapproducer.model.HelloResponse;

public class HelloServiceImp implements HelloService{
    @Override
    public HelloResponse sayHello(HelloRequest request) {
        HelloResponse response = new HelloResponse();
        response.setGreeting("Hello, " + request.getName() + "!");
        return response;
    }

    @Override
    public ByeResponse sayBye(ByeRequest request) {
        ByeResponse response = new ByeResponse();
        response.setGreeting("Goodbye, " + request.getName() + "!");
        return response;
    }
}
