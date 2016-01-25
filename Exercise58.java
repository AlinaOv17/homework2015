class Exercise58{
public static void main(String[] args){
int onehoural = Integer.parseInt (args[0]);
int hours = Integer.parseInt (args[1]);
double overpay;
double all;
if (hours > 40 && hours < 60 && onehoural >= 8){
	overpay = 1.5 * onehoural* (hours - 40);
     all = 40 * onehoural + overpay;
	 System.out.println ("The week salary is " + all);
}
else if (hours <=40 && onehoural >=8){
	
	int al = hours* onehoural;
	  System.out.println ("The week salary is " + al);
}
	
  else {
	  
	  System.out.println ("the salary should be not less than 8 dollars per hour and work should be less than 60 hours a week" );
	    
  }
}
 
}


