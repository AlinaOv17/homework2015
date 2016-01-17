class Exercise23{
public static void main(String[] args){
int year = Integer.parseInt (args[0]);
if (year % 4 == 0 ){
	if (year % 100 ==0 && year % 400 !=0){
	
	System.out.println ("The " + year + " year is not a leap year and has 366 days");
	
	}

 else {
	 
	 System.out.println ("The " + year + " year is a leap year and has 365 days");
 }
}
 else {
	System.out.println ("The " + year + " year is not a leap year and has 366 days"); 
 
}

}

}
