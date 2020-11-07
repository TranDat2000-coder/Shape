
public class Sphere extends ThreeDimensionalShape {

	final double pi = 3.14;
	
	public Sphere(float radius) {
		super(radius);
	}
	
	@Override
	public float getArea() {
		return (float) (4 * pi * Math.pow(getRadius(), 2));
	}
	
	@Override
	public float getVolumn() {
		return (float) ((4 / 3) * pi * (Math.pow(getRadius(), 3)));
		
	}
}
