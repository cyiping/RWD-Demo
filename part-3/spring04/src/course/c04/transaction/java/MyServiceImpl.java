package course.c04.transaction.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import course.c04.transaction.MyDao;
import course.c04.transaction.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	MyDao myDao;

	@Transactional
	public void doTx() {
		myDao.do1();
		myDao.do2();
		System.out.println("all insert finished!");
	}

}
