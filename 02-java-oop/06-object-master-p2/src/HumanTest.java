import java.util.ArrayList;
public class HumanTest {

	public static void main(String[] args) {
		ArrayList<Samurai>samurai= new ArrayList<Samurai>();
		Human h1 = new Human();
		Human h2 = new Human();
		Ninja n1 = new Ninja();
		Wizard w1 = new Wizard();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		samurai.add(s1);
		samurai.add(s2);
		
		h1.attack(h2);
		System.out.println(h2.getHealth());
		
		System.out.println(h1.toString());
		
		w1.heal(h2);
		w1.fireball(h1);
		
		n1.steal(h1);
		n1.runAway();
		
		s1.deathBlow(h2);
		s2.meditate();
		s1.meditate();
		System.out.println(samurai.size());
	}

}
