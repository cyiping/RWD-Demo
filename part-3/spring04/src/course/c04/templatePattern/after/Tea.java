package course.c04.templatePattern.after;

public class Tea extends DrinkTemplate {

	@Override
	void cookMain() {
		System.out.println("Steep Tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Add fruit to Tea");
	}
	
	@Override
	void hook() {
		System.out.println("Add ice or some stuffs to Tea");
	}

}
