import java.awt.Color;
public class Color extends Object implements Paint, Serializable{
private float r;
private float g;
private float b;
public Color(float r, float g, float b){
	this.r = r;
	this.g = g;
	this.b = b;
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
	public void setR(floar r){
		this.r = r;
	}
	public void setG(floar g){
		this.g = g;
	}
	public void setB(floar b){
		this.b = b;
	}
}