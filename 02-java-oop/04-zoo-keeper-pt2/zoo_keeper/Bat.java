package zoo_keeper;

public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
		if (energyLevel < 5) {
			System.out.println("Bat has no energy, eat a hooman?");
			this.eatHumans();
		}
	}
	public void fly() {
		if (this.getEnergyLevel() < 50) {
			System.out.println("Bat has no energy, eat a hooman?");
			this.eatHumans();
		}
		System.out.println("Bat is now flying");
		
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("Bat eats human");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	public void attackTown()	{
		if (this.getEnergyLevel() < 100) {
			System.out.println("Bat has no energy, eat a hooman?");
			this.eatHumans();
		}
		System.out.println("Bat is dive bombing the town");
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}
}
