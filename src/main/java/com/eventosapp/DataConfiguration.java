package com.eventosapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


import ch.qos.logback.core.db.DriverManagerConnectionSource;

@Configuration
public class DataConfiguration {
	
	/*@Bean
	public DataSource dataSource() {
		DriverManagerConnectionSource dataSource = new DriverManagerConnectionSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/eventoapp?autoReconnect=true");
		dataSource.setUser("root");
		dataSource.setPassword("airtonde93");
		return dataSource();
	}
	
	public JpaVendorAdapter  JpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialec");
		adapter.setPrepareConnection(true);
		return adapter;
		
	};*/
	

}
