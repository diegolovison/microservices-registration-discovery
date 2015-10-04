package br.com.diegolovison.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by diego.lovison on 02/10/2015.
 */

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {

    public static void main(String... args) {

        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
