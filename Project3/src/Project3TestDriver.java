//Faysal Khatri
import java.text.DecimalFormat;
import geometry205.*;

public class Project3TestDriver {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		double shapesArea = 0;
		DecimalFormat f = new DecimalFormat("###########.##");
		
		shapes[0] = new Square(3);
		shapes[1] = new Rectangle(3,5);
		shapes[2] = new Circle(2);
		shapes[3] = new RightTriangle(4,6);
		
	
		for (int i=0;i<shapes.length;i++) {
			shapesArea += shapes[i].area();
		}
		
		System.out.println("Project 3 Test Driver");
		System.out.println("Total area of shapes: " + f.format(shapesArea));
		
	}

}