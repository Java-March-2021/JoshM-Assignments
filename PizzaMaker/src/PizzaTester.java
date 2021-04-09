import java.util.Arrays;

public class PizzaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] toppings = {"Jalapeno", "Olives", "Jalapeno", "Anchovies"};
		Pizza cheesePizza = new Pizza(toppings, "Deep Dish", 'L', 8);
		Pizza theDavid = new Pizza(new String[] {"cheese", "sausage", "pepperoni"});
		
		System.out.println(Arrays.toString(theDavid.getTopping()));
		Pizza.advertise();
		
		
		
		
	}
	
}