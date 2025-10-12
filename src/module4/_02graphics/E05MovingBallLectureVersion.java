package module4._02graphics;

import java.awt.Color;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		
		StdDraw.enableDoubleBuffering();
		
		//starting values
		int numberOfBalls = 10;
		double[] ballX = new double[numberOfBalls];
		double[] ballXVelocity = new double[numberOfBalls];
		double[] ballY = new double[numberOfBalls];
		double[] ballYVelocity = new double[numberOfBalls];

		for(int i = 0; i < numberOfBalls; i++) {
			ballX[i] = Math.random();
			ballY[i] = Math.random();
			ballXVelocity[i] = Math.random() * 0.01;
			ballYVelocity[i] = Math.random() * 0.01;
		}

		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.01;

		int score = 0;

		long lastPointGiven = System.currentTimeMillis();
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);
		
		//infinite animation loop
		while (true) {
			//Record the time at the start of the loop to use for
			//comparison for timed events (such as score)
			long now = System.currentTimeMillis();

			//Step 1: Clear the canvas
			StdDraw.clear();
			
			//Step 2: Update position of all moving objects
			for(int i = 0; i < numberOfBalls; i++) {
				ballX[i] = ballX[i] + ballXVelocity[i];
				ballY[i] = ballY[i] + ballYVelocity[i];
				if(ballX[i] > 0.975 || ballX[i] < 0) { //too far right or left
					ballXVelocity[i] = -ballXVelocity[i]; //bounce
				}
				if(ballY[i] > 0.975 || ballY[i] < 0) { //too far right or left
					ballYVelocity[i] = -ballYVelocity[i]; //bounce
				}

				double distance = Math.sqrt(Math.pow(playerX - ballX[i], 2) + Math.pow(playerY - ballY[i], 2));
				if(distance < 0.05) { //collision!
					playerX = 0.5;
					playerY = 0.5;
					score = 0;
					lastPointGiven = now;
				}
			}

			if(StdDraw.isKeyPressed(KeyEvent.VK_W)) { //up
				playerY += playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_S)) { //down
				playerY -= playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_A)) { //left
				playerX -= playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_D)) { //right
				playerX += playerSpeed;
			}

			if(now - lastPointGiven > 1000) { //one second elapsed
				score++;
				lastPointGiven = now;
			}
			
			//Step 3: Draw on canvas and pause
			StdDraw.setPenColor(Color.RED);
			for(int i = 0; i < numberOfBalls; i++) {
				StdDraw.point(ballX[i], ballY[i]);
			}
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.point(playerX, playerY);
			StdDraw.text(0.5, 0.1, "Score: " + score);
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(20);
			
		}
	}
}
