package module6._1recursion;

/*
 * Exercise: Use the debugger to examine how this recursive method works.
 * Add examples for the factorial of 4 and the factorial of 1.
 */
public class E01FactorialTest {

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int factorialLoop(int n){ //from Prof. Shook's lecture
		int result = 1;
		while(n!=0){
			result*=n;
			n--;
		}
		return result;
	}

	public static int countOddR(int[] values){ //code from lecture
		int count = 0;
		int i = 0;
		int result = countOddHelper(values, count, i);
		return result;
	}

	public static int countOddHelper(int[] values, int count, int i){ //code from lecture
		if(i >= values.length){
			return count;
		}
		else{
			if(values[i]%2 == 1){
				count++;
			}
			return countOddHelper(values, count, i + 1);
		}
	}

	public static void mystery (int x) {
   	System.out.print(x % 10);
   	if ((x / 10) != 0) {
      	mystery(x / 10);
   	}
   	System.out.print(x % 10);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(6));
		System.out.println(factorial(1));
		System.out.println(factorialLoop(4));
		System.out.println(factorialLoop(6));
		System.out.println(factorialLoop(1));

		System.out.println();
		int[] test = {1,1,2,3,5,8,13};
		System.out.println(countOddR(test));

		System.out.println();
		mystery(1234); // I copypasted the mystery code in here so I could look at it with the debugger.
	}
}
