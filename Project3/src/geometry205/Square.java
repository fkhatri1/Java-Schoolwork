//Faysal Khatri
package geometry205;

import java.text.DecimalFormat;

public class Square extends Shape {

	public Square(double a) {
		dimensions = new double[1];
		dimensions[0] = a;	
	}

	public double perimeter() {
		return dimensions[0] * 4;
	}

	public double area() {
		return dimensions[0] * dimensions[0];
	}

	public void setSides(double a) {
		dimensions[0] = a;
	}
	
	public String toString() {
		DecimalFormat f = new DecimalFormat("###########.##");
		return "Square of perimeter " + f.format(perimeter()) + " and area of " + f.format(area());
	}
	
}
