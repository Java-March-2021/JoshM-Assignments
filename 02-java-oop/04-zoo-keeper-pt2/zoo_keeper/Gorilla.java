package zoo_keeper;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
		if (energyLevel < 5) {
			System.out.println("Gorilla have no energy, eat banana");
			this.eatBananas();
		}
	}
	public void throwSomething() {
		if (this.getEnergyLevel() < 5) {
			System.out.println("Gorilla have no energy, eat banana");
			this.eatBananas();
		}
		System.out.println("Gorilla throws item");
		
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	public void eatBananas() {
		System.out.println("Gorilla eats banana");
		this.setEnergyLevel(this.getEnergyLevel()+10);
	}
	public void climb()	{
		if (this.getEnergyLevel() < 10) {
			System.out.println("Gorilla have no energy, eat banana");
			this.eatBananas();
		}
		System.out.println("Gorilla climb tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
	}
}

//public class Gorilla extends Mammal {
//
//	public Gorilla() {
//		super("Gorilla", 500);
//		// TODO Auto-generated constructor stub
//	}
//	public void eatBanana() {
//		System.out.printf("I'm a %s eating a banana \n", this.species);
//	}
//	public void takeDamage(int damageAmount) {
//		this.health -= (damageAmount/2);
//	}
//}
