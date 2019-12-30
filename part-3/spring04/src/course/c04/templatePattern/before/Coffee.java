package course.c04.templatePattern.before;

public class Coffee {

	void boilWater() {
		System.out.println("Boil Water for Coffee");
	}

	void brewCoffee() {
		System.out.println("Brew Coffee");
	}

	void pourInCup() {
		System.out.println("Pour Coffee in cup");
	}

	void addSugarAndMilk() {
		System.out.println("Add sugar & milk to Coffee");
	}
	
	void process() {
		boilWater();
		brewCoffee();
		pourInCup();
		addSugarAndMilk();
	}

}
