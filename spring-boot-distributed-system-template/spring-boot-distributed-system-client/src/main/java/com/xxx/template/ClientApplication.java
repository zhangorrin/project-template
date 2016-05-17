package com.xxx.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/4/11 17:56
 * @version: V1.0.0
 * @Description:
 **/
@SpringBootApplication
public class ClientApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ClientApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
