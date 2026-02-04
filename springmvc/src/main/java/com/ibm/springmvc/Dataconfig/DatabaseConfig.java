package com.ibm.springmvc.Dataconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ibm.springmvc")
public class DatabaseConfig {

	@Bean
	public DataSource dataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/Springmvc");
		ds.setUsername("malleswari");
		ds.setPassword("Malli@2004");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
