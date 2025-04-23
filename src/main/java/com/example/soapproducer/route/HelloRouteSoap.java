package com.example.soapproducer.route;

import com.example.soapproducer.service.HelloService;
import com.example.soapproducer.service.HelloServiceImp;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRouteSoap extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("cxf:/hello?serviceClass=com.example.soapproducer.service.HelloService")
                .routeId("hello-soap-route")

                .choice()
                    .when(simple("${header.operationName} == 'sayHello'"))
                        .bean(HelloServiceImp.class,"sayHello")
                    .when(simple("${header.operationName} == 'sayBye'"))
                        .bean(HelloServiceImp.class,"sayBye")
                .endChoice()

                .log("${body}");


    }
}
