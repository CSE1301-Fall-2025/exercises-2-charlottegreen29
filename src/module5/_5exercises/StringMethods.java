package module5._5exercises;



public class StringMethods {

	// A method that takes in a ``String`` and returns that string concatenated with itself. This one is completed for you.

	public static String selfConcat(String s) {
		return intConcat(s,2);
	}

	// A method that takes in a ``String`` and an ``int n``, and returns n copies of the string concatenated together
	
	public static String intConcat(String s, int n){
		String[] array = new String[n];
		for (int i=0; i<array.length; i++){
			array[i]=s;
		}
		String output = join(array,'\u0000'); //the char here is the empty char unicode cuz I can't do ''.
		return output;
	}
	
	//Now go back and rewrite your first method by having it call the second one.
	/// done
	
	// Take a look at Java�s `split method, that splits a ``String`` into an array containing the parts split by the specified regular expression.
		// Here, assume the regular expression is simply " ", so that the input String is split into words.

	public static String[] split(String s, char regex){
		int numObjects=1;
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i)==regex){
				numObjects++;
			}
		}
		String[] array = new String[numObjects];
		int arrayLocation=0;
		String nextString="";
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i)!=regex){
				nextString=nextString+s.charAt(i);
			}
			else{
				array[arrayLocation]=nextString;
				arrayLocation++;
				nextString="";
			}
		}
		array[arrayLocation]=nextString;
		return array;
	}

	//  * Write a method ``join(String[] array, String joiner)`` that is the inverse of split: it returns a single String with a copy of the joiner string between each part.
	
	public static String join(String[] array, char regex){
		String output="";
		for (int i=0; i<array.length; i++){
			output=output+array[i];
			if (i!=array.length-1){
				output=output+regex;
			}
		}
		return output;
	}

	// Rewrite your second method in terms of this last one. To do this, create an array that has n copies of a given String, and then use your join method to concatenate them.
	//Think about the string you want to appear between the copies, so that it appears the strings were concatenated together as before.
	///done, thought I think that makes things more complicated than it needs to be.
	/// I had to use the \u0000 unicode for my empty char.
	

	//// Okay, I'm in class doing another practice problem, which is to make a method that finds the max value of an int array.
	public static int maxValue(int[] array){
		int maxVal=array[0];
		for (int i=0;i<array.length;i++){
			if (array[i]>maxVal){
				maxVal=array[i];
			}
		}
		return maxVal;
	}


	public static void main(String[] args) {

		//
		// Testing the methods
		// //
		System.out.println(selfConcat("echo"));
		System.out.println(intConcat("echo",4));

		String[] splitExample = split("boo:and:foo",':');
		for (String item:splitExample){
			System.out.print(item);
			System.out.print(" ");
		}
		System.out.println();
		String[] splitExample2 = split("boo:and:foo",'o');
		for (String item:splitExample2){
			System.out.print(item);
			System.out.print(" ");
		}
		System.out.println();

		System.out.print(join(splitExample,':'));

		System.out.println();
		System.out.println();

		int[] lesMisArray = {2,4,6,0,1};
		System.out.println(maxValue(lesMisArray));

		int[] negLesMis = {-2,-4,-6,0,-1};
		System.out.println(maxValue(negLesMis));
		
	}
}
