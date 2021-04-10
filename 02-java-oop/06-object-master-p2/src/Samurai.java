import java.util.ArrayList;

public class Samurai extends Human{
	public Samurai() {
		super();
		this.setHealth(200);
	}
	public void deathBlow (Human h) {
		h.setHealth(0);
		System.out.println(h.getClass()+" dies");
		this.setHealth(this.getHealth()/2);
	}
	public void meditate () {
		this.setHealth(200);
	}
	public void howMany (ArrayList<Samurai> samurai) {
		System.out.println("Samurai count: "+samurai.size());
	}
	public String toString() {
		return "Samurai [getStrength()=" + getStrength() + ", getStealth()=" + getStealth() + ", getIntelligence()="
				+ getIntelligence() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}