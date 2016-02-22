public class Ellipse implements Shape{
private double semiMajAx;
private double semiMinAx;
public double P = 3.14D;

    public Ellipse(){
	 semiMajAx = semiMinAx = 0.0;
 }
  
    public Ellipse(double semiMajAx, double semiMinAx){
	 this.semiMajAx = semiMajAx;
	 this.semiMinAx = semiMinAx;
}

	public double getSemiMajAx(){
return semiMajAx;
}
    public double getSemiMinAx(){
return semiMinAx;
}
    public void setSemiMajAx(double semiMajAx){
this.semiMajAx = semiMajAx;
}
    public void setSemiMinAx(double semiMinAx){
this.semiMinAx = semiMinAx;
}

	public double getArea(){
		return P * getSemiMajAx() * getSemiMinAx();
	}
	public double getPerimeter(){
		return 2 * P * Math.sqrt((getSemiMajAx() * getSemiMajAx() + getSemiMinAx() * getSemiMinAx())/2);
	}
	
}