
public class Square extends TwoDimensionalShape {
	
	public Square(float length) {
		super();
		setLength(length);
	}
	
	@Override
	public float getArea() {
		return (float) Math.pow(getLength(), 2);
	}
}
