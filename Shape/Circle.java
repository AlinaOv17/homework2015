public class Circle implements Shape{
private double radius;
public double P = 3.14D;
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
  	public double getArea(){
		return P * getRadius() * getRadius();
	}
	public double getPerimeter(){
		return 2 * P * getRadius();
	}
	
}