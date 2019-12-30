package course.c04.templatePattern.before;

public class Tea {

	void boilWater() {
		System.out.println("Boil Water for Tea");
	}

	void steepTea() {
		System.out.println("Steep Tea");
	}

	void pourInCup() {
		System.out.println("Pour Tea in cup");
	}

	void addFruit() {
		System.out.println("Add fruit to Tea");
	}

	void process() {
		boilWater();
		steepTea();
		pourInCup();
		addFruit();
	}

}
