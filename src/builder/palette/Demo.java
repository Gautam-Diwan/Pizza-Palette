package builder.palette;

import builder.palette.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new PizzaBuilder()
		.setCheese(true)
		.setChicken(true)
		.setBrocolli(false)
		.setCapsicum(true)
		.setSize(10)
		.build();
		pizza.print();
	}

}
