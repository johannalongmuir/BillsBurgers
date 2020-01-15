import com.sun.tools.corba.se.idl.constExpr.Or;

public class Main{

	public static void main(String[]args){
//		System.out.println("Welcome to Bills Burgers \n");
//		Hamburger hamburger = new Hamburger("White", "Beef");
//		System.out.println(hamburger.orderSummary() + "\n");
//
//		hamburger.addAdditionalTopping("Lettuce");
//		hamburger.addAdditionalTopping("Tomato");
//		hamburger.addAdditionalTopping("Cheese");
//		hamburger.addAdditionalTopping("Mustard");
//		hamburger.addAdditionalTopping("Onion");
//		hamburger.addAdditionalTopping("Ketchup");
//		System.out.println("\n");
//
//
//		System.out.println(hamburger.getAllAdditionalToppings());
//		System.out.println(hamburger.getTotalPrice()); // should be 10
//		System.out.println("\n");
//
//		Hamburger healthyBurger = new HealthyBurger("Beef");
//		System.out.println(healthyBurger.orderSummary());
//		healthyBurger.getAllAdditionalToppings();
//		healthyBurger.addAdditionalTopping("Lettuce");
//		healthyBurger.addAdditionalTopping("Tomato");
//		healthyBurger.addAdditionalTopping("Cheese");
//		healthyBurger.addAdditionalTopping("Mustard");
//		healthyBurger.addAdditionalTopping("Onion");
//		healthyBurger.addAdditionalTopping("Ketchup");
//		healthyBurger.addAdditionalTopping("Mushroom");
//
//		System.out.println(healthyBurger.getAllAdditionalToppings());
//		System.out.println(healthyBurger.getTotalPrice());
//		System.out.println("\n");
//		healthyBurger.removeAdditionalTopping("Lettuce");
//		System.out.println("\n");
//		System.out.println(healthyBurger.orderSummary());
//
//		System.out.println(healthyBurger.getTotalPrice());
//
//		System.out.println(healthyBurger.orderSummary());
//
//		System.out.println("\n");
		DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Beef", "Coke");
//		System.out.println(deluxeHamburger.getChips());
		System.out.println(deluxeHamburger.getDrink());
//		deluxeHamburger.addAdditionalTopping("Lettuce");


		Order order = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		Order order4 = new Order();
		System.out.println(order.getOrderNumber());
		System.out.println(order2.getOrderNumber());
		System.out.println(order3.getOrderNumber());
		System.out.println(order4.getOrderNumber());

	}

}
