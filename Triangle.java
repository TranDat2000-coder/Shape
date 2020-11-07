
public class Triangle extends TwoDimensionalShape {
	
	public Triangle(float width, float height) {
		super();
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public float getArea() {
		return (getWidth() * getHeight()) / 2;
	}
}
