public class Square implements Shape{
private double a;
private float r;
private float g;
private float b;
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
		return getA() * getA();
	}
	public double getPerimeter(){
		return 4 * getA();
	}
	
}