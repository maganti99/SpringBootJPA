package com.nagesh.springJPA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

//@Configuration
//@ComponentScan(value={"com.nagesh.jdbc.dao"})
public class Config {
			
		//@Bean
		public DataSource getDataSource(){
			/*System.out.println("Bean DriverManagerDataSource created");
			DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
			driverManagerDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			driverManagerDataSource.setUrl("jdbc:sqlserver://L4754344:1433;DatabaseName=nagdb;integratedSecurity=true");
			driverManagerDataSource.setUsername("");
			driverManagerDataSource.setPassword("");
			return driverManagerDataSource ;*/
			return null;
		}
}
