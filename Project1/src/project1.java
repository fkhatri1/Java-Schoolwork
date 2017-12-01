//Faysal Khatri
import java.text.DecimalFormat;

public class project1 {
	
	static Point p1 = new Point();
	static Point p2 = new Point(2,2);

	public static void main(String[] args) {
		System.out.println("Initial values:");
		printPoints();
		
		System.out.println("\nSetting P1 to (1,1) and P2 to (2,2):");
		p1.setX(1);
		p1.setY(1);
		p2.setPoint(2,2);
		printPoints();
		
		System.out.println("\nRotating P1 by pi rad and P2 by pi/2 rad:");
		p1.rotate(Math.PI);
		p2.rotate(Math.PI/2);
		printPoints();
		
		System.out.println("\nShifting P1 by 2, 3 and P2 by 4, 4");
		p1.shiftX(2);
		p1.shiftY(3);
		p2.shiftX(4);
		p2.shiftY(4);
		printPoints();
	}
	
	public static void printPoints() {
		DecimalFormat f = new DecimalFormat("###########.##");
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Distance from P1 to P2: " + f.format(p1.distance(p2)));
	}


}
