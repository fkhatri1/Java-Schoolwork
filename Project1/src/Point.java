//Faysal Khatri
import java.text.DecimalFormat;

public class Point {

private double x;
private double y;

public Point() {
	this.x = 0;
	this.y = 0;
}

public Point(double x, double y) {
	this.x = x;
	this.y = y;
}

public void setX(double x) {
	this.x=x;		
}

public void setY(double y) {
	this.y=y;
}

public void setPoint(double x, double y) {
	this.x=x;
	this.y=y;
}

public void shiftX(double n) {
	this.x+=n;
}

public void shiftY(double n) {
	this.y+=n;
}

public double distance(Point p2) {
	double diffX = p2.x-this.x;
	double diffY = p2.y-this.y;
	return Math.sqrt(diffX*diffX + diffY*diffY);
}

public void rotate(double angle) {
	double xprime = this.x*Math.cos(angle) - this.y*Math.sin(angle);
	double yprime = this.x*Math.sin(angle) + this.y*Math.cos(angle);
	this.x=xprime;
	this.y=yprime;
}

public String toString() {
	DecimalFormat f = new DecimalFormat("###########.##");
	String p = "(" + f.format(this.x) + "," + f.format(this.y) + ")";
	return p;
}

}
