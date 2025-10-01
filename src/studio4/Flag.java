package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(42,82,190);
		StdDraw.filledSquare(0,0,1);

		StdDraw.setPenColor(255,255,0);
		double[]x = {0.5, 0.5433, 0.4567};
		double[]y = {0.55, 0.45, 0.45};
		StdDraw.filledPolygon(x,y);
		double[]a = {0.4567, 0.5433, 0.5};
		double[]b = {0.525, 0.525, 0.425};
		StdDraw.filledPolygon(a,b);
		
	}
}