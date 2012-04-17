package cg2.raytracer;

import cg2.raytracer.utils.Scene;
import cg2.raytracer.utils.camera.Camera;
import cg2.warmup.ImageGenerator;

public class Raytracer {

	private int width;
	private int height;

	public Raytracer(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public void raytrace(Camera camera, Scene scene, String path) {

		String filename = path + "/Documents/BHfT/Computergrafik II/Uebung 1/"
				+ "RaytracerImage.png";
		new ImageGenerator(new RaytracerImage(camera, scene), width, height,
				filename, "png");
		ImageGenerator.showImage(filename);
	}
}
