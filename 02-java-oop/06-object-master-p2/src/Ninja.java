
public class Ninja extends Human {

	public Ninja() {
		super();
		this.setStealth(10);
	}
	
	public void steal (Human h) {
		h.setHealth(h.getHealth()-this.getStealth());
		System.out.println("ninja steals health");
		this.setHealth(this.getHealth()+10);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
	public String toString() {
		return "Ninja [getStrength()=" + getStrength() + ", getStealth()=" + getStealth() + ", getIntelligence()="
				+ getIntelligence() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}