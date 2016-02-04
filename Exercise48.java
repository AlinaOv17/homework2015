class Exercise48{
public static void main(String[] args){
determ(39, 150, -11);
int ar=determ(39, 150, -11);
System.out.println("The smallest is " + ar);
}

public static int determ(int a, int b, int c){
	if ( a < b && a < c){
return a;
	}
	if ( b < c && b < a){
	return b;
	}
	else{
	return c;
}
	
}

}