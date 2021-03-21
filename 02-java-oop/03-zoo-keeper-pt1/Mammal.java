package zoo_keeper;

public class Mammal {
	protected int energyLevel = 100;

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergyLevel() {
		System.out.println(this.getEnergyLevel());
		
		return this.getEnergyLevel();
	}
}


//public class Mammal implements Attackable {
//	protected String species;
//	protected int health;
//	
//	public Mammal (String species, int health) {
//		this.species = species;
//		this.health = health;
//	}
//
//	public String getSpecies() {
//		return species;
//	}
//
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//
//	public int getHealth() {
//		return health;
//	}
//
//	public void setHealth(int health) {
//		this.health = health;
//	}
//	public void attack (Attackable target) {
////		decrement health
//		int health = target.getHealth();
//		target.setHealth(health);
//	}
//	public void takeDamage(int damageAmount) {
//		this.health -= damageAmount;
//	}
//}
