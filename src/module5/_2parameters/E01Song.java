package module5._2parameters;

/*
 * Exercise: Add a third verse to the main method below with an
 * animal of your choice. Use the debugger to step through
 * and see the three different versions of the method call.
 */
public class E01Song {

	public static void verse(String animal, String noise) {
		System.out.println( "Old MacDonald had a farm" );
		System.out.println( "E-I-E-I-O" );
		System.out.println( "And on that farm he had a " + animal );
		System.out.println( "E-I-E-I-O" );
		System.out.println( "With a " + noise + "-" + noise + " here") ;
		System.out.println( "And a " + noise + "-" + noise + " there" );
		System.out.println( "Here a " + noise + ", there a " + noise );
		System.out.println( "Everywhere a " + noise + "-" + noise );
		System.out.println( "Old MacDonald had a farm" );
		System.out.println( "E-I-E-I-O" );
		System.out.println();
	}

	public static void main(String[] args) {
		verse( "cow" , "moo" );
		verse( "duck" , "quack" );
		verse("pig" , "oink");
	}
}

