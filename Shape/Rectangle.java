public class Rectangle implements Shape{
private double height;
private double width;
private float r;
private float g;
private float b;
    public Rectangle(){
	 height = width = 0.0;
 }
  
    public Rectangle(double height, double width){
	 this.height = height;
	 this.width = width;
}
    public double getHeight(){
return height;
}
   public double getWidth(){
return width;
}
  
    public void setHeight(double height){
this.height = height;
}
  public void setWidth(double width){
this.width = width;
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
		return getHeight() * getWidth();
	}
	public double getPerimeter(){
		return (getHeight() + getWidth())*2;
	}
	
}