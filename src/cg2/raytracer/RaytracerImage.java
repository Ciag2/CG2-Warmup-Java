package cg2.raytracer;

import cg2.raytracer.utils.Hit;
import cg2.raytracer.utils.Ray;
import cg2.raytracer.utils.Scene;
import cg2.raytracer.utils.camera.Camera;
import cg2.vecmath.Color;
import cg2.warmup.Painter;

public class RaytracerImage implements Painter {

	private Camera camera;
	private Scene scene;

	public RaytracerImage(Camera camera, Scene scene) {
		this.camera = camera;
		this.scene = scene;
	}

	@Override
	public Color pixelColorAt(int x, int y, int resolutionX, int resolutionY) {

		Ray generateRay = camera.generateRay(x, y, resolutionX, resolutionY);
		Hit intersect = scene.intersect(generateRay);

		if (intersect == null) {
			// Hintergrundfarbe - schwarz
			return new Color(0, 0, 0);
		} else {

			return intersect.getColor();
		}

	}
}
