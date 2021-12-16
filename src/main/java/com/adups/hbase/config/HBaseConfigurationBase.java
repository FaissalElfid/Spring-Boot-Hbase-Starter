package com.adups.hbase.config;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author faissal
 * @date 23/11/2017.
 */

@org.springframework.context.annotation.Configuration
//@ConfigurationProperties(prefix = "hbase.zookeeper")
public class HBaseConfigurationBase {

	@Bean
	public Configuration configuration() {
		Configuration conf=HBaseConfiguration.create();
		return conf;
	}
}
