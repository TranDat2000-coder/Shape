
public class Cube extends ThreeDimensionalShape {
	
	public Cube(float width) {
		super(width);
		setWidth(width);
	}
	
	@Override
	public float getArea() {
		return (float) (6 * Math.pow(getWidth(), 2));
	}
	
	@Override
	public float getVolumn() {
		return (float) (Math.pow(getWidth(), 3));
	}
}
