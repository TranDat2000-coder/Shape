
public class ShapeMain {
	public static void main(String[] args) {
		TwoDimensionalShape circle = new Circle(4);
		TwoDimensionalShape square = new Square(3);
		TwoDimensionalShape triangle = new Triangle(2, 4);
	
		
		System.out.println("Circle: " + circle.getArea());
		System.out.println("Square: " + square.getArea());
		System.out.println("Triangle:  " + triangle.getArea());
		System.out.println();
		
		ThreeDimensionalShape sphare = new Sphere(3);
		System.out.println("Sphere: " + sphare.getArea());
		System.out.println("Volumn Sphere: " + sphare.getVolumn());
		
		ThreeDimensionalShape cube = new Cube(5);
		System.out.println("\nCube: " + cube.getArea());
		System.out.println("Volumn Cube: " + cube.getVolumn());
	}
}
