package builder.palette;

import builder.palette.PizzaBuilder;
import builder.palette.PizzaBase;

public class Pizza {
	private final int size;
	private final boolean chicken;
	private final boolean cheese;
	private final boolean mushrooms;
	private final boolean brocolli;
	private final boolean capsicum;
	private final boolean onion;
	private PizzaBase pizzaBase;
	public Pizza(PizzaBuilder builder) {
		this.size = builder.getSize();
		this.chicken = builder.isChicken();
		this.cheese = builder.isCheese();
		this.mushrooms = builder.isMushrooms();
		this.brocolli = builder.isBrocolli();
		this.capsicum = builder.isCapsicum();
		this.onion = builder.isOnion();
		this.pizzaBase = builder.getPizzaBase();
	}

	public void print() {
		System.out.println("Size: " + this.size);
		System.out.println("Pizza Base: " + this.pizzaBase);
		System.out.println("Chicken: " + this.chicken);
		System.out.println("Cheese: " + this.cheese);
		System.out.println("Mushrooms: " + this.mushrooms);
		System.out.println("Brocolli: " + this.brocolli);
		System.out.println("Capsicum: " + this.capsicum);
		System.out.println("Onion: " + this.onion);
	}

}
