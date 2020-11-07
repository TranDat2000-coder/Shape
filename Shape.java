
public abstract class Shape {
	
	private float width;
	private float length;
	private float height;
	
	public Shape() {
	}
	
	public Shape(float width, float length, float height) {
		setWidth(width);
		setLength(length);
		setHeight(height);
	}
	
	

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public abstract float getArea();
}
