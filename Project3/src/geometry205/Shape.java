//Faysal Khatri
package geometry205;

public abstract class Shape {

	public abstract double perimeter();
	public abstract double area();
	protected double dimensions[];
	
	public double[] getSides() {
		return this.dimensions;
	}
	
}
