package module5._3return;

/*
 * Exercise: Write a method randomNumberInRange() that takes in two
 * integer parameters, min and max, and returns a random integer value
 * from within that range (inclusive). Test your method by calling it
 * from the main method.
 */
public class E04RandomNumberInRange {
	//add your method here
	public static int randomNumberInRange(int min, int max){
		int range = max - min + 1;
		int num = (int)(Math.random()*range+min);
		return num;
	}


	public static void main(String args[]) {
		//test your method by calling it
		System.out.print(randomNumberInRange(2,5));
	}
}
