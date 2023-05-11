package builder.palette;

import builder.palette.Pizza;
import builder.palette.PizzaBase;

public class PizzaBuilder {
	private int size=12;
	private boolean chicken=false;
	private boolean cheese=true;
	private boolean mushrooms=false;
	private boolean brocolli=false;
	private boolean capsicum=false;
	private boolean onion=true;
	private PizzaBase pizzaBase = PizzaBase.NORMAL;
	public PizzaBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public PizzaBuilder setChicken(boolean chicken) {
		this.chicken = chicken;
		return this;
	}
	public PizzaBuilder setCheese(boolean cheese) {
		this.cheese = cheese;
		return this;
	}
	public PizzaBuilder setMushrooms(boolean mushrooms) {
		this.mushrooms = mushrooms;
		return this;
	}
	public PizzaBuilder setBrocolli(boolean brocolli) {
		this.brocolli = brocolli;
		return this;
	}
	public PizzaBuilder setCapsicum(boolean capsicum) {
		this.capsicum = capsicum;
		return this;
	}
	public PizzaBuilder setOnion(boolean onion) {
		this.onion = onion;
		return this;
	}
	public PizzaBuilder setPizzaBase(PizzaBase pizzaBase) {
		this.pizzaBase = pizzaBase;
		return this;
	}

	public int getSize() {
		return size;
	}
	public boolean isChicken() {
		return chicken;
	}
	public boolean isCheese() {
		return cheese;
	}
	public boolean isMushrooms() {
		return mushrooms;
	}
	public boolean isBrocolli() {
		return brocolli;
	}
	public boolean isCapsicum() {
		return capsicum;
	}
	public boolean isOnion() {
		return onion;
	}public PizzaBase getPizzaBase() {
		return pizzaBase;
	}
	public Pizza build() {
        return new Pizza(this);
    }

}
