package module5._1writing;

/*
 * Exercise: Notice that there is a repeated line in the below song (called a refrain).
 * Create a refrain method that includes this line, then update
 * the main method to call the refrain method when needed.
 */
public class E02FarmerSong {

	public static void refrain(){
		System.out.println("The tag is in the back");
	}

	public static void main(String[] args) {
		refrain();
		refrain();
		System.out.println("Hi-ho the derry-o");
		refrain();
	}
}
