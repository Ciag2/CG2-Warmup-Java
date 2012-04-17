package cg2.raytracer.utils.shapes;

import cg2.raytracer.utils.Hit;
import cg2.raytracer.utils.Ray;
import cg2.vecmath.Color;
import cg2.vecmath.Vector;

public class Sphere extends AbstractShape {

	private Vector center;
	private float radius;
	private Color color;

	public Sphere(Vector center, float radius, Color color) {
		this.center = center;
		this.radius = radius;
		this.color = color;
	}

	@Override
	public Hit intersect(Ray ray) {

		Vector x0 = ray.getOrigin().sub(center);
		Vector d = ray.getNormalizedDirection();

		float t1 = 0.0f;
		float t2 = 0.0f;

		if ((x0.dot(d) * x0.dot(d)) * ((x0.dot(x0)) - (radius * radius)) < 0) {
			return null;
		}

		if ((x0.dot(d) * x0.dot(d)) * ((x0.dot(x0)) - (radius * radius)) == 0) {

			t1 = -(x0.dot(d));

			return new Hit(ray.getPoint(t1), color);

		} else {

			t1 = (float) (-(x0.dot(d)) + Math.sqrt((x0.dot(d) * x0.dot(d))
					* ((x0.dot(x0)) - (radius * radius))));
			t2 = (float) (-(x0.dot(d)) - Math.sqrt((x0.dot(d) * x0.dot(d))
					* ((x0.dot(x0)) - (radius * radius))));

			if (t1 < t2) {
				return new Hit(ray.getPoint(t1), color);
			} else {
				return new Hit(ray.getPoint(t2), color);

			}
		}

	}

}
