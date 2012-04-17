package cg2.raytracer.utils;

import java.util.ArrayList;

import cg2.raytracer.utils.shapes.AbstractShape;

public class Scene {

	ArrayList<AbstractShape> shapeList;

	public Scene() {
		this.shapeList = new ArrayList<AbstractShape>();
	}

	public void addShape(AbstractShape shape) {
		shapeList.add(shape);
	}

	public Hit intersect(Ray ray) {

		ArrayList<AbstractShape> sortedList = new ArrayList<AbstractShape>();

		for (AbstractShape shapes : sortedList) {
			if (shapes.intersect(ray) != null) {
				return shapes.intersect(ray);
			}
		}
		return null;
	}
}
