//Faysal Khatri
package geometry205;

import java.text.DecimalFormat;

public class Circle extends Shape {

	public Circle(double radius) {
		dimensions = new double[1];
		dimensions[0] = radius;
	}

	public double perimeter() {
		return (2*Math.PI*dimensions[0]);
	}

	public double area() {
		return (0.5*Math.PI*dimensions[0]*dimensions[0]);
	}


	public void setSides(double radius) {
		dimensions[0] = radius;
	}

	public String toString() {
		DecimalFormat f = new DecimalFormat("###########.##");
		return "Circle of circumference " + f.format(perimeter()) + " and area of " + f.format(area());
	}
}
