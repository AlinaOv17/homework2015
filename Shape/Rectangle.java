public class Rectangle implements Shape{
private double height;
private double width;

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
 	public double getArea(){
		return getHeight() * getWidth();
	}
	public double getPerimeter(){
		return (getHeight() + getWidth())*2;
	}
	
}