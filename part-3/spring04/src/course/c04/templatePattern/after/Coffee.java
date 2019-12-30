package course.c04.templatePattern.after;

public class Coffee extends DrinkTemplate {

	@Override
	void cookMain() {
		System.out.println("Brew Coffee");
	}

	@Override
	void addCondiments() {
		System.out.println("Add sugar & milk to Coffee");
	}

}
