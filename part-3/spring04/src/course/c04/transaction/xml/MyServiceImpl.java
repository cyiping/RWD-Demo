package course.c04.transaction.xml;

import org.springframework.transaction.annotation.Transactional;

import course.c04.transaction.MyDao;
import course.c04.transaction.MyService;

public class MyServiceImpl implements MyService {

	MyDao myDao;

	public MyServiceImpl(MyDao myDao) {
		this.myDao = myDao;
	}

	@Transactional
	public void doTx() {
		myDao.do1();
		myDao.do2();
		System.out.println("all insert finished!");
	}

}
