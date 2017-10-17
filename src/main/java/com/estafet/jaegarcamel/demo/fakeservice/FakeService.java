package com.estafet.jaegarcamel.demo.fakeservice;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by ivo.costa@estafet.com on 17/10/2017.
 */
@Component
public class FakeService extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("netty4-http:http://0.0.0.0:8080/fakeservice")
                .to("log:foo")
                .setBody()
                .simple("Fake answer!");;
    }
}
