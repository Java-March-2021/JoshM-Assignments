
public class Pizza {


	//	*things that pizzas have- attributes
//	string crust
//	string topping
//	char size "L"
//	int slices
	private String topping;
	private String crust;
	private char size;
	private int slices;
	static int numOfPizzasMade;

//	constructor
	public Pizza(String topping, String crust, char size, int slices) {
		this.topping = topping;
		this.crust = crust;
		this.size = size;
		this.slices = slices;
	
	}
//	Method Overloading
	public Pizza(String topping, char size, int slices) {
		this.crust= "Deep Dish";
		this.topping = topping;
		this.size = size;
		this.slices = slices;
	}
//	protected access class
	
//	things you can do
//	Advertise()
	public static void advertise( ) {
		System.out.println("Definitely not Mob affiliated");
	}
//	Eat()
	public int eatSlice(int slices) {
		this.slices -= 1;
		return this.slices;
	}
	
	public void pizzaFight(Pizza otherPizza) {
		otherPizza.eatSlice(1);
		System.out.println("%s took a bite out of %s and is missing 1 piece!");
	}
	
	
//	Methods
//	getters
	public String getCrust() {
		return this.crust;
	}
	public String getTopping() {
		return topping;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
//	setters
	public void setCrust(String crust) {
		if(topping.equals("")) {
			System.out.println("Hey Pizzas need Crust!");
			return;
		}
		this.crust = crust;
	}
	public void setTopping(String[] topping) {
		this.topping = topping;
	}
	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}
	
}

