public class Circle implements Shape{
private double radius;
public double P = 3.14D;
private float r;
private float g;
private float b;
    public Circle(){
	 radius = 0.0;
 }
  
    public Circle(double radius){
	 this.radius = radius;
	 
}
    public double getRadius(){
return radius;
}
   
    public void setRadius(double radius){
this.radius = radius;
}
public float getR(){
		return r;
	}
	public float getG(){
		return g;
	}
	public float getB(){
		return b;
	}
  	public double getArea(){
		return P * getRadius() * getRadius();
	}
	public double getPerimeter(){
		return 2 * P * getRadius();
	}
	
}