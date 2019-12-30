package course.c04.transaction.java;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import course.c04.transaction.MyDao;

@Repository
public class MyDaoImpl implements MyDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MyDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void do1() {
		jdbcTemplate.update("INSERT INTO TEST(VAL) VALUES ('java.1')");
	}

	public void do2() {
		jdbcTemplate.update("INSERT INTO TEST(VAL) VALUES ('java.2')");
		throw new RuntimeException("some error hits!");
	}
}
