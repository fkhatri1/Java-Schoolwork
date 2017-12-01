//Faysal Khatri
package geometry205;

import java.text.DecimalFormat;

public class RightTriangle extends Shape {

	public RightTriangle(double base, double height) {
		dimensions = new double[3];
		dimensions[0] = base;
		dimensions[1] = height;
		dimensions[2] = Math.sqrt(base*base + height*height);
	}
	
	public double perimeter() {
		double perimeter = 0;
		for (int i=0;i<dimensions.length;i++){
			perimeter+=dimensions[i];
		}
		return perimeter;
	}

	public double area() {
		return (0.5*dimensions[0]*dimensions[1]);
	}

	public void setSides(double base, double height) {
		dimensions[0] = base;
		dimensions[1] = height;
		dimensions[2] = Math.sqrt(base*base + height*height);
	}
	
	public String toString() {
		DecimalFormat f = new DecimalFormat("###########.##");
		return "Right Triangle of perimeter " + f.format(perimeter()) + " and area of " + f.format(area());
	}
}
