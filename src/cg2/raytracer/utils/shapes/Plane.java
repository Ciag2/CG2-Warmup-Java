package cg2.raytracer.utils.shapes;

import cg2.raytracer.utils.Hit;
import cg2.raytracer.utils.Ray;
import cg2.vecmath.Color;
import cg2.vecmath.Vector;

public class Plane extends AbstractShape {

	Color color;
	Vector normal;
	float distance;

	public Plane(Vector normal, float distance, Color color) {
		this.normal = normal;
		this.distance = distance;
		this.color = color;
	}

	@Override
	public Hit intersect(Ray ray) {

		// AnkerPunkt auf der Ebene
		Vector anchorPoint = ray.getOrigin();

		Vector direction = ray.getNormalizedDirection();
		float t = 0.0f;

		// ray parallel zur plane?
		if (normal.dot(direction) == 0) {
			return null;
		} else {
			t = ((distance - normal.dot(anchorPoint)) / normal.dot(direction));
			return new Hit(ray.getPoint(t), color);
		}
	}

}
