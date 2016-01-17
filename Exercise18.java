class Exercise18{
public static void main(String[] args){
int a = Integer.parseInt (args[0]);
 int b, c, d;
 if (a <99 || a > 1000){
	System.out.println ("Please, enter a three-digit number!"); 
	 
 }
  if (a >99 && a < 1000){
 b = a% 10; // единицы
 c = ((a % 100) -b) / 10; // десятки
 d = ((a % 1000) - (a % 100)) / 100;  // sotni
 
if (d < c && c < b){
	System.out.println ("The digits of a number " + a + " form an increasing sequence");
		
}
 else {
	System.out.println ("The digits of a number " + a + " do not form an increasing sequence"); 
	
 }
 
 }

}
}