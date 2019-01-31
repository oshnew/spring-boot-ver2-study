package com.biz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class SpringBootVer2StudyApplication {

    public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootVer2StudyApplication.class);
        Environment env = app.run(args).getEnvironment();

        // @formatter:off
		String protocol = "http";

		log.info("\n----------------------------------------------------------\n" +
			"Access URLs\n" +
			"Local: \t{}://localhost:{}\n" +
			"----------------------------------------------------------",
			protocol,
			env.getRequiredProperty("server.port")
		);

		// @formatter:on
    }

}

