//Faysal Khatri
import geometry205.*;

public class testClass {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = new Rectangle (40.33,23.73);
		Square s1 = new Square(4);
		RightTriangle rt1 = new RightTriangle(3,4);
		Circle c1 = new Circle(4.338);
		
		System.out.println(r1);
		System.out.println(s1);
		System.out.println(r2);
		System.out.println(rt1);
		System.out.println(c1);
		
		System.out.println("\nSides of rt1: ");
		for (int i=0;i<rt1.getSides().length;i++) {
			System.out.println(rt1.getSides()[i]);
		}
		
		
		System.out.println("\nChanging rt1 to base 9 and height 12...");
		rt1.setSides(9, 12);
		
		System.out.println("\nNew sides of rt1: ");
		for (int i=0;i<rt1.getSides().length;i++) {
			System.out.println(rt1.getSides()[i]);
		}

		System.out.println("\n" + rt1);

	}
}