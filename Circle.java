
public class Circle extends TwoDimensionalShape {
	
	private float radius;
	final double pi = 3.14;
	
	public Circle( float radius) {
		setRadius(radius);
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		
		return (float) (Math.pow(radius, 2) * pi);
		
	}
}
