package com.xxx.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/4/11 17:56
 * @version: V1.0.0
 * @Description:
 **/
@EnableWebMvc
@SpringBootApplication
public class ClientApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
