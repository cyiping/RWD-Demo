package course.c04.jdbcDriver;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@Configuration
@ComponentScan
public class Config {

	@Bean
	public DataSource driverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUrl("jdbc:derby://localhost:1527/myDB");
		ds.setUsername("root");
		ds.setPassword("sa");
		return ds;
	}

	@Bean
	public DataSource singleConnectionDataSource() {
		SingleConnectionDataSource ds = new SingleConnectionDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUrl("jdbc:derby://localhost:1527/myDB");
		ds.setUsername("root");
		ds.setPassword("sa");
		return ds;
	}

}
