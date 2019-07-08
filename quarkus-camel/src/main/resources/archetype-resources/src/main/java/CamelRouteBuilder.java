package ${package};

import org.apache.camel.builder.RouteBuilder;

public class CamelRouteBuilder extends RouteBuilder {

    public void configure() {
        from("servlet:ping").to("direct:ping");
    }
}