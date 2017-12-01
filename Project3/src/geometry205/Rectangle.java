//Faysal Khatri
package geometry205;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

	public Rectangle(double a, double b) {
		dimensions=new double[2];
		dimensions[0]=a;
		dimensions[1]=b;
	}

	public double perimeter() {
		return 2 * (dimensions[0] + dimensions[1]);
	}

	public double area() {
		return dimensions[0]*dimensions[1];
	}
	
	public void setSides(double a, double b) {
		dimensions[0]=a;
		dimensions[1]=b;
	}
	
	public String toString() {
		DecimalFormat f = new DecimalFormat("###########.##");
		return "Rectangle of perimeter " + f.format(perimeter()) + " and area of " + f.format(area());
	}

}

