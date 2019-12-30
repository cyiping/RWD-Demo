package course.c04.template;

public interface EmployeeDao {

	Employee findById(int id);

	void add(Employee e);

	void modify(Employee e);

}
