package org.javaee7.jaxrs.endpoint;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.logging.LoggingFraction;
import org.wildfly.swarm.undertow.UndertowFraction;

/**
 * @author Ken Finnigan
 */
public class Main {
    public static void main(String... args) throws Exception {
        Swarm swarm = new Swarm()
                .fraction(
                        UndertowFraction
                                .createDefaultFraction()
                                .httpPort(9111)
                );

        swarm.start();

        swarm.deploy();
    }
}
