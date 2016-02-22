public class Triangle implements Shape{
private double height;
private double base;
private double a;
private double c;
    public Triangle(){
	 base = height= a= c = 0.0;
 }
  
    public Triangle(double base, double a, double c, double height){
	 this.base = base;
	 this.height = height;
}
    public double getBase(){
return base;
}
   public double getA(){
return a;
}
   public double getC(){
return c;
}
    public double getHeight(){
return height;
}
    public void setBase(double base){
this.base = base;
}
  public void setA(double a){
this.a = a;
}
  public void setC(double c){
this.c = c;
}
    public void setHeight(double height){
this.height = height;
}

	public double getArea(){
		return ((getBase() * getHeight())/2);
	}
	public double getPerimeter(){
		return (getA()+getBase()+getC());
	}
	
}