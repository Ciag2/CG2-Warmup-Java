package cg2.raytracer.utils;

import cg2.vecmath.Color;
import cg2.vecmath.Vector;

public class Hit {

	private Vector hitPoint;
	private Color color;

	public Hit(Vector hitPoint, Color color) {
		this.hitPoint = hitPoint;
		this.color = color;
	}

	public Vector getHitPoint() {
		return hitPoint;
	}

	public Color getColor() {
		return color;
	}

}
