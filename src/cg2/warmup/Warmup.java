package cg2.warmup;

import cg2.raytracer.Raytracer;
import cg2.raytracer.utils.Scene;
import cg2.raytracer.utils.camera.Camera;
import cg2.raytracer.utils.shapes.AbstractShape;
import cg2.raytracer.utils.shapes.Plane;
import cg2.raytracer.utils.shapes.Sphere;
import cg2.vecmath.Color;
import cg2.vecmath.Vector;

public class Warmup {

	public static void main(String[] args) {

		// get the user's home directory - should work on all operating systems
		String path = System.getProperty("user.home");

		// ************ test painting a checkerboard ************
		{
			// String filename = path
			// + "/Documents/BHfT/Computergrafik II/Warmup/"
			// + "checkerboard.png";
			// new ImageGenerator(new Checkerboard(), 750, 750, filename,
			// "png");
			// ImageGenerator.showImage(filename);
		}

		// ************ test painting a disk ************
		{
			// ...
		}

		// ************ Raytracer ************
		{
			Raytracer raytracer = new Raytracer(800, 600);

			Scene scene = new Scene();
			Camera camera = new Camera();
			AbstractShape sphere = new Sphere(new Vector(0, 0, -6), 3,
					new Color(0, 1, 0));
			AbstractShape plane = new Plane(new Vector(0, 1, 0), -2, new Color(
					1, 0, 0));
			scene.addShape(sphere);
			scene.addShape(plane);

			raytracer.raytrace(camera, scene, path);
		}
	}
}
