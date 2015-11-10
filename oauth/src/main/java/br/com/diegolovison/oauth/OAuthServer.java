package br.com.diegolovison.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by diego.lovison on 06/11/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
public class OAuthServer {

    public static void main(String... args) {

        SpringApplication.run(OAuthServer.class, args);
    }
}
