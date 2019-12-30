package course.c04.templatePattern.after;

public class Main {

	public static void main(String[] args) {
		DrinkTemplate drink;
		drink = new Coffee();
		drink.processTemplate();
		System.out.println("-------------------------------");
		drink = new Tea();
		drink.processTemplate();
	}

}
