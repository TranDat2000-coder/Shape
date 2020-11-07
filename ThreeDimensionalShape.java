
public class ThreeDimensionalShape extends Shape implements Volumn{
	
	private float radius;
	
	public ThreeDimensionalShape() {
		
	}
	
	public ThreeDimensionalShape(float radius) {
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
		return 0;
	}
	
	@Override
	public float getVolumn() {
		return 0;
	}
}
