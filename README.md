# Pizza Builder

This Java project demonstrates the use of the Builder design pattern to create customizable pizzas. 

## Installation

To use this project, follow these steps:

1. Clone this repository using the command: `git clone https://github.com/yourusername/pizza-builder.git`
2. Import the project into your preferred Java IDE.
3. Run the `Demo.java` file to see a sample pizza being built.

## Usage

The project contains the following classes:

- `Pizza`: Represents a pizza and contains information about its size, toppings, and base.
- `PizzaBuilder`: The builder class that sets the properties of the `Pizza` object.
- `PizzaBase`: An enum representing the different types of pizza bases.

To create a `Pizza` object, use the `PizzaBuilder` class to set the desired toppings, size, and base. Then call the `build()` method to create the `Pizza` object. For example:

```
Pizza pizza = new PizzaBuilder()
	.setSize(10)
	.setCheese(true)
	.setChicken(true)
	.setPizzaBase(PizzaBase.CHEESE_BURST)
	.build();
```

## How the Builder Pattern is Used and Why is it Useful Here

The Builder pattern is used in this project to simplify the creation of complex `Pizza` objects. Instead of having to specify all of the pizza's properties at once in a constructor, the Builder pattern allows you to set individual properties in any order using a fluent API. This makes the code more readable and maintainable, especially as more properties are added to the `Pizza` object.

For example, if the `Pizza` object had 10 properties, a constructor with all the parameters would be very long and difficult to use. With the Builder pattern, you can easily set only the properties you need, in any order, and the remaining properties will use default values.

```
Pizza pizza = new PizzaBuilder()
	.setSize(10)
	.setCheese(true)
	.setChicken(false)
  	.setCapsicum(true)
  	.setOnion(true)
	.build();
```
I hope this helps!
