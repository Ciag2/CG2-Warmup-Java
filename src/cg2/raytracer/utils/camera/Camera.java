package cg2.raytracer.utils.camera;

import cg2.raytracer.utils.Ray;
import cg2.vecmath.Vector;

public class Camera {

	// private float fieldOfView;
	private double x;
	private double y;
	private double z;
	private double alpha;
	private double w;

	public Camera() {
		// this.fieldOfView = fieldOfView;
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.alpha = (float) Math.toRadians(90);

	}

	public Ray generateRay(int i, int j, int resolutionX, int resolutionY) {

		// Seitenverhältniss des Bildes in der Bildebene
		w = 1.0;
		double h = (resolutionX / resolutionY) * w;

		// Pixelkoordinaten x, y und z om der Bildebene
		z = w / (2 * Math.tan(alpha / 2));

		x = (-w / 2) + (i + 0.5) * (w / resolutionX);

		y = (-h / 2) + (j + 0.5) * (h / resolutionY);

		// Strahl
		return new Ray(new Vector(0.0f, 0.0f, 0.0f), new Vector((float) x,
				(float) y, (float) z).normalize());
	}
}
