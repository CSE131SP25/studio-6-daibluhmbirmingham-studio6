package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;
		}else {
			return Math.pow(2, -n)+geometricSum(n-1);
		}
			// FIXME compute the geometric sum for the first n terms recursively
			
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		RecursiveMethods.circlesUponCircles(0.0, 0.0, radius, radiusMinimumDrawingThreshold);
		// FIXME complete the recursive drawing
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] reversedHelper(int[] array, int i) {
		if (i >= array.length/2) {
			int former = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i]=former;
			return reversedHelper (array,i-1);
		}else {
			return array;
		}
		
	}
	public static int[] toReversed(int[] array) {
		
		int reversed[] = Arrays.copyOf (array, array.length );
		int i = reversed.length-1;
		return reversedHelper(reversed, i);
		
			// FIXME create a helper method that can recursively reverse the given array
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}


}
