package com.vmanav123.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableConfigurationProperties(Database.class)
@SpringBootApplication
@RefreshScope
public class Application implements ApplicationRunner {

	@Autowired
	private Database database;

	@Value("${db.url:NA}")
	private String url;

	@Value("${db.username:NA}")
	private String username;

	@Value("${db.password:NA}")
	private String password;

	@Value("${postgres.db.url:NA}")
	private String url_new;

	@Value("${postgres.db.username:NA}")
	private String username_new;

	@Value("${postgres.db.password:NA}")
	private String password_new;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("url : "+url+" , username : "+username+" , password : "+password);
		System.out.println("url : "+url_new+" , username : "+username_new+" , password : "+password_new);
		System.out.println("Database : "+database);
	}
}
