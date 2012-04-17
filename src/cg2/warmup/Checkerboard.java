package cg2.warmup;

import cg2.vecmath.Color;

public class Checkerboard implements Painter {

	@Override
	public Color pixelColorAt(int i, int j, int resolutionX, int resolutionY) {

		int x = (i * 8) / resolutionX;
		int y = (j * 8) / resolutionY;

		System.out.println();
		// this is just a little hint -
		// but not yet the solution to paint an 8x8 checkerboard for any given
		// resolution
		if (x % 2 + y % 2 == 1) {

			return new Color(0, 0, 0);
		} else {

			return new Color(1, 1, 1);
		}

	}

}
