package com.nuu.sample.routes;

import org.apache.camel.*;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class NotificarEstadoCuentaRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {



           onException(Exception.class)
                .id("excepcion-general")
                .description("Procesa las excepciones, para cerrar los registros de trazabilidad y enviar alertas en su caso.")
                .handled(true)
                .log(LoggingLevel.WARN, "${in.header.messageLog}[camel-context.onException] EXCEPCION GENERAL EN EL PROCESO -")
                .log(LoggingLevel.WARN, "${in.header.messageLog}[camel-context.onException] Mensaje de Error ${exception.stacktrace}")
                .removeHeaders("*")
                .log("${header.messageLog}[camel-context.onException]:: !!! TERMINA PROCESO WEBSERVICE NOTIFICAR ESTADO CUENTA CON ERROR¡¡¡");



        from("timer:foo?period=1m").to("log:foo");


    }
}
