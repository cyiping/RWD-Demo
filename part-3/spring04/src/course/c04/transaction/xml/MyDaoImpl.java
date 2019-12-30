package course.c04.transaction.xml;

import org.springframework.jdbc.core.JdbcTemplate;

import course.c04.transaction.MyDao;

public class MyDaoImpl implements MyDao {

	private JdbcTemplate jdbcTemplate;

	public MyDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void do1() {
		jdbcTemplate.update("INSERT INTO TEST(VAL) VALUES ('xml.1')");		
	}

	@Override
	public void do2() {
		jdbcTemplate.update("INSERT INTO TEST(VAL) VALUES ('xml.2')");
		throw new RuntimeException("some error hits!");
	}
}
