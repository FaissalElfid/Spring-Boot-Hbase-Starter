package com.adups;


import org.apache.hadoop.conf.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author  allen
 */
@SpringBootApplication
public class KafkaHBaseApplication {

	public static void main(String[] args) throws Exception {
		BasicConfigurator.configure();
		System.setProperty("hadoop.home.dir", "D:\\hadoop\\");
		SpringApplication.run(KafkaHBaseApplication.class, args);
	}
}
