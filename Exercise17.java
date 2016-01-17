class Exercise17{
public static void main(String[] args){
int a = Integer.parseInt (args[0]);
if(
a % 2 !=0 && a > 100 && a <1000){
	System.out.println("The number " + a + " is odd three-digit");
}
else {
	System.out.println("The num is wrong");
}
}
	
}