package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.05);
		StdDraw.point(0.2,0.1);
		
		//Draw a larger green point someplace else
		Color betterGreen = new Color(0,150,5);
		StdDraw.setPenColor(betterGreen);
		StdDraw.setPenRadius(0.07);
		StdDraw.point(0.6,0.1);

		//Draw an unfilled red triangle somewhere
		double triangleXs[] = {0.1,0.2,0.1};
		double triangleYs[] = {0.8,0.8,0.9};
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.01);
		StdDraw.polygon(triangleXs,triangleYs);

		//Draw a filled yellow circle somewhere
		Color prettyYellow = new Color(255, 232, 64);
		StdDraw.setPenColor(prettyYellow);
		StdDraw.filledCircle(0.85,0.2,0.08);

		//Draw a filled blue rectangle somewhere
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.1,0.5,0.05,0.25);

	}
}
