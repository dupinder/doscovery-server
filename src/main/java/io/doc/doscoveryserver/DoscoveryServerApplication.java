package io.doc.doscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DoscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoscoveryServerApplication.class, args);
	}

}
