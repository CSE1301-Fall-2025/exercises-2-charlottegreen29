package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E04WaitPoint {

	/*
	 * Exercise: Use the StdDraw API to complete the code one
	 * step at a time.
	 */
	public static void main(String[] args) {
		
		boolean qPressed=false;

		StdDraw.setPenColor(0,0,0);
		StdDraw.setPenRadius(0.02);

		while (qPressed==false){
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();

			// wait for the mouse to be pressed and released
			boolean isPressed = StdDraw.mousePressed();

			// draw a point at the location of the mouse
			if (isPressed==true){
				StdDraw.point(x,y);
				}
			
			// here, a q has been typed
			if (StdDraw.hasNextKeyTyped()) {
				char got = StdDraw.nextKeyTyped();
    			if (got == 'q') {
        			qPressed = true;
    				}
				}

			}

		StdDraw.text(0.5, 0.5, "Farewell!");

		}
		

	}
