package module5._3return;

/*
 * Exercise: Pass in different values to the volumeCylinder method,
 * and use the debugger to examine the return values given
 * by the method.
 */
public class E01VolumeExample {
	public static double volumeCylinder(double radius, double height) {
		return Math.PI * radius * radius * height;
	}   

	public static void main(String args[]) {
		// Calculate the volume of a cylinder  radius=4 and height=10
		double vol = volumeCylinder(1, 2);
		System.out.println(vol);
	}
}
