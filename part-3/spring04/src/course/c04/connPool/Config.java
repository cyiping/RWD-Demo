package course.c04.connPool;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUrl("jdbc:derby://localhost:1527/myDB");
		ds.setUsername("root");
		ds.setPassword("sa");
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		return ds;
	}

}
