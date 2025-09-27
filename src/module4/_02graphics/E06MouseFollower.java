package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E06MouseFollower {

	/*
	 * Exercise: Use the to draw a point on the canvas that follows the mouse. 
	 * To do this, you will need to acquire the coordinates of the mouse, 
	 * then draw something at that point.
	 * 
	 * Once you get it working, experiment with the timings to see
	 *  if you can get the image to "lag" behind the mouse.
	 */
	public static void main(String[] args) {

		StdDraw.enableDoubleBuffering();

		StdDraw.setPenColor(150,40,100);
		StdDraw.setPenRadius(0.04);

		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			StdDraw.point(x, y);

			//  
			// End of your frame
			//
			// Stdraw.show() achieves double buffering and
			//   the pause(10) avoids the tight spinning loop
			StdDraw.show();
			StdDraw.pause(100);
		}

	}
}
