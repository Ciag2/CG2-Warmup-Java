package cg2.raytracer.utils.shapes;

import cg2.raytracer.utils.Hit;
import cg2.raytracer.utils.Ray;

public abstract class AbstractShape {

	public abstract Hit intersect(Ray ray);
}
