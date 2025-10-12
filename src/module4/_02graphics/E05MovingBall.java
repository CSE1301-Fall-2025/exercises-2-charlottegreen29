package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		double ballX = 0.5;
		double ballY = 0.9;
		double ballXVelocity = 0.005;
		double ballYVelocity = 0.005;

		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);
		
		while (true) {  ///Infinite loops are okay now! 
			
			//Step 1: Clear the canvas
			StdDraw.clear();
			
			//Step 2: Update position of all objects
			if (ballXVelocity>0){
				ballX = ballX + ballXVelocity; ///0.005 is the speed of the ball, which is what Shook calls a "magic number" which he doesn't like because it's a non-labled number, so we turned it into a variable.
			}
			else{
				ballX = ballX - ballXVelocity;
			}
			if (ballYVelocity>0){
				ballY = ballY + ballYVelocity; 
			}
			else{
				ballY = ballY - ballYVelocity;
			}
			if(ballX > 0.975 || ballX<0.025) { //too far one direction
				ballXVelocity=(((Math.random()*0.01)-0.005))*(ballXVelocity); //bounces in new direction!
			}
			if(ballY > 0.975 || ballY<0.025) {
				ballYVelocity=(((Math.random()*0.01)-0.005))*(ballYVelocity);
			}
			
			//Step 3: Draw on canvas (and pause)
			StdDraw.point(ballX, ballY);
			
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(10); ///time is in miliseconds; the higher this number is, the slower the animation moves.
								 ///note: you don't want your frame rate too fast because your computer won't be able to handle it.
		}
	}
}
