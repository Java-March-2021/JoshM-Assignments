import java.util.Arrays;
import java.util.Iterator;
import java.lang.reflect.Array;
//know how many indices you need
import java.util.ArrayList;
// unknown size
public class BasicJava {
	//Task- Print 1-255
	public static void print255() {
		for(int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}
	//Task- Print odd numbers between 1-255
	public static void printOdd() {
		for(int i = 0; i<= 255; i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
	}

	//Task- Print Sum
	public static int printSum() {
		int sum = 0;
		for(int i = 0; i <= 255; i++) {
			sum += i;
			System.out.println(("New number : " + i )+(" Sum: " + sum));
		}
		return sum;
	}
	//Task- Iterating through an array
	public static void thruArr(int[] arr) {
		for(int val: arr) {
			System.out.println(val);
		}
	}
	//Task- Find Max
	public static int getMax(int[]arr) {
		int max = Integer.MAX_VALUE;
		for (int val: arr) {
			if (val > max) 
				max = val;
			System.out.println(max);
		}
		return max;
	}
	public static int getMin(int[] arr) {
		int min =Integer.MIN_VALUE;
		for (int val: arr) {
			if (val < min)
				min = val;
		}
		return min;
	}
	//Task- Get Average
	public static int getArrSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static double getAvg(int[] arr) {
		int sum = getArrSum(arr);
		double avg = (double)sum/arr.length;
		System.out.println(("Sum: " + sum)+(", Average: " + avg));
		return avg;
	}
	//Task- Array with Odd Numbers
	public static ArrayList<Integer> oddArray() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i <= 255; i++) {
			if(i %2 != 0)
				nums.add(i);
		}
		return nums;
	}
	//Task- Greater Than Y
	public static void greaterThanY(int[] arr, int y) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > y) 
				count++;
		}
		System.out.println(count);
	}
	//Task- Square the values
	public static void squareArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	//Task- Eliminate Negative Numbers
	public static void noNeg(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) 
				arr[i] = 0;	
		}
	}
	//Task- Max, Min, and Average
	public static void maxMinAvg(int[] arr) {
		int max = getMax(arr);
		int min = getMin(arr);
		double avg = getAvg(arr);
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
	}
	//Task- Shifting the Values in the Array
	public static void shiftArrVal(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = 0;
	}

}
