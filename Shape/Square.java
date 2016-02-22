public class Square implements Shape{
private double a;

    public Square(){
	 a = 0.0;
 }
  
    public Square(double a){
	 this.a = a;
	 
}
    public double getA(){
return a;
}
   
    public void setA(double a){
this.a = a;
}
  	public double getArea(){
		return getA() * getA();
	}
	public double getPerimeter(){
		return 4 * getA();
	}
	
}