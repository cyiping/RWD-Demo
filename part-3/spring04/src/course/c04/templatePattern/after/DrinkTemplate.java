package course.c04.templatePattern.after;

public abstract class DrinkTemplate {

	void boilWater() {
		System.out.println("Boil Water for " + this.getClass().getSimpleName());
	}

	abstract void cookMain();

	void pourInCup() {
		System.out.println("Pour " + this.getClass().getSimpleName() + " in cup");
	}

	void hook() {}
	
	abstract void addCondiments();

	void processTemplate() {
		boilWater();
		cookMain();
		pourInCup();
		addCondiments();
		hook();
	}

}
