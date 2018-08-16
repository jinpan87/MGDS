package com.isoftstone.spring_boot_helloworld.plat.datasource;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSource extends com.alibaba.druid.pool.DruidDataSource {
	private static final long serialVersionUID = 1L;

	@Bean
	@Primary
	public DataSource dataSource() {
		return new DruidDataSource();
	}

}
