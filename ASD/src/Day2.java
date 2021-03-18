import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
//	entry point
	public static void main(String[] args) {
		// Arrays
		String[] people= {"Matthew", "Edgar", "David", "Laura"};
		
		//Arrays are fixed in size!
		int[] numbers= new int[10];
		for (int i = 0; i<numbers.length; i++) {
			numbers[i]=i+1;
		}
//		numbers[2]=300;
//		Array Lists
		System.out.println(Arrays.toString(numbers));
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		System.out.println(stringList);
		
		for(String number : stringList) {
			System.out.println(number);
		}
		System.out.println(stringList.get(2));
		System.out.println(stringList.contains("two"));
		System.out.println(stringList.indexOf("two"));
//		with indexOf. 1 is found -1 is not found
		
//		Hash Maps var object = {key => value}
//		instant look-up no matter what you input
		HashMap<String, String> ourHobbies = new HashMap<String, String>();
		ourHobbies.put("Matt", "Photography");
		ourHobbies.put("Edgar", "Singing");
//		you will need to have unique keys in order to display multiple keys with similar names
		ourHobbies.put("Michael S", "Playing Video Games");
		ourHobbies.put("David", "Reading");
		ourHobbies.put("Curtis", "Football");
		ourHobbies.put("Laura", "Sewing/Quilting");
		ourHobbies.put("Michael", "Cooking");
		ourHobbies.put("Kevin", "Play Soccer");
		System.out.println("______________");
		System.out.println(ourHobbies);
		System.out.println(ourHobbies.get("Laura"));
		for(String name : ourHobbies.keySet()) {
			System.out.println(name);
		}
		System.out.println("______________");
		for(String hobby : ourHobbies.values()) {
			System.out.println(hobby);
		}
		System.out.println("______________");
		for(HashMap.Entry<String, String> entry : ourHobbies.entrySet()) {
			System.out.println("key = " + entry.getKey() + " Value " + entry.getValue());
		}
		System.out.println("______________");
		
	}

	public static int getMax(int[] nums) {
		
	}

}
