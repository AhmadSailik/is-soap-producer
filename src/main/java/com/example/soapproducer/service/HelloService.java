package com.example.soapproducer.service;

import com.example.soapproducer.model.ByeRequest;
import com.example.soapproducer.model.ByeResponse;
import com.example.soapproducer.model.HelloRequest;
import com.example.soapproducer.model.HelloResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HelloService {

    @WebMethod
    HelloResponse sayHello(HelloRequest request);

    @WebMethod
    ByeResponse sayBye(ByeRequest request);


}
