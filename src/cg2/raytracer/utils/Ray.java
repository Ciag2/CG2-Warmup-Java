package cg2.raytracer.utils;

import cg2.vecmath.Vector;

public class Ray {

	private Vector origin;
	private Vector direction;

	public Ray(Vector origin, Vector direction) {
		this.origin = origin;
		this.direction = direction;
	}

	public Vector getOrigin() {
		return origin;
	}

	public Vector getNormalizedDirection() {
		return direction.normalize();
	}

	public Vector getPoint(float t) {
		return origin.add(direction.mult(t));
	}

}
