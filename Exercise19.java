class Exercise19{
public static void main(String[] args){
int a = Integer.parseInt (args[0]);
 int b, c, d, e;
 if (a <1000 || a > 9999){
	System.out.println ("Please, enter a four-digit number!"); 
	 
 }
  if (a >999 && a < 10000){
 b = a% 10; // единицы
 c = ((a % 100) -b) / 10; // десятки
 d = ((a % 1000) - (a % 100)) / 100; // sotni
 e = ((a % 10000) - (a % 1000)) / 1000; // sotni
  if ( b == e && c ==d){
	  System.out.println("The number " + a + " is a palindrome number");
	
	    }
		else {
	System.out.println ("The number " + a + " is not a palindrome number"); 
 }
  
 }
 
}
}