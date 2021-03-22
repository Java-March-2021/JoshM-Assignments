package zoo_keeper;
import java.util.ArrayList;

public class ZooKeeper {

	public static void main(String[] args) {
		Gorilla one = new Gorilla(100);
		
		one.throwSomething();
		one.throwSomething();
		one.throwSomething();
		one.eatBananas();
		one.eatBananas();
		one.climb();
		one.displayEnergyLevel();
	}

}

//public class ZooKeeper {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Mammal matt = new Mammal("Human", 100);
//		Gorilla maggilla = new Gorilla();
//		Barrel barrel = new Barrel("barrel1");
//		
//		Gorilla dK = new Gorilla();
//		dK.attack(barrel);
//		
//		maggilla.eatBanana();
//		
//		ArrayList<Mammal> ourMammals = new ArrayList<Mammal>();
//		ourMammals.add(matt);
//		ourMammals.add(maggilla);
//		
//		for(Mammal m : ourMammals) {
//			System.out.println(m.getSpecies());
//		}
// 	}
//
//}
