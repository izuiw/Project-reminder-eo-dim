package com.izuiw.eodim.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



@Configuration
@PropertySource("classpath:/application.properties") //①
@MapperScan(value="com.izuiw.eodim.mapper")
public class MybatisConfig {
	

	    //②
	    @Bean
	    @ConfigurationProperties(prefix="spring.datasource.hikari")
	    public HikariConfig hikariConfig() {
	        return new HikariConfig();
	    }

	    //③
	    @Bean
	    public DataSource dataSource() throws Exception {
	        DataSource dataSource = new HikariDataSource(hikariConfig());
	        //System.out.println("마이바티스 컨피그 :: " + dataSource.toString());
	        return dataSource;
	    }

}
