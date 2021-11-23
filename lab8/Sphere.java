package ie.itcarlow.lab8;

public class Sphere extends ThreeDShape{

	private double radius;	
	
		
	 public Sphere (String name, String colour, double radius)
	{
	super(name,colour);
	this.radius = radius;
	}


	
	public double volume() {//volume formula of a sphere 

		return 4 / 3.0 * Math.PI * radius * radius * radius;
	}


	
	public double area() {//area formula of a sphere 
		
		return 4 * Math.PI * radius * radius;
	}
	
	
	
	
	
	
	
}
