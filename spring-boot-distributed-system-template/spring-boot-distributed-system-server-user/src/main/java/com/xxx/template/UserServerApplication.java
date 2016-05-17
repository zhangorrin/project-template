package com.xxx.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/4/11 17:56
 * @version: V1.0.0
 * @Description:
 **/
@EnableTransactionManagement
@SpringBootApplication
public class UserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerApplication.class, args);
	}

}
