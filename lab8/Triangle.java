package ie.itcarlow.lab8;

public class Triangle extends TwoDShape{

private double height;
private double base;
	
public Triangle (String name, String colour, double base, double height)
	{
	super(name,colour);
	this.height = height;
	this.base = base;
	}
	
public double area() {
	
return 0.5 * base * height;
}
	

public String toString() {
	
return super.toString() + "\nBase" + base + "/nheight" + height; 
}
	



}
