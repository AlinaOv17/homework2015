class Exercise26{
public static void main(String[] args){
int num = Integer.parseInt (args[0]);
int sot, des, ed, des1;
if ( num > 999 || num < 100){
	System.out.println("Please, enter the number from 100 to 999");
}

 ed = num % 10; // единицы
 des = ((num % 100) -ed) / 10; // десятки
 sot = ((num % 1000) - (num % 100)) / 100; // sotni

 if ( num >99 && num < 1000){
if ( sot == 1){
	
	System.out.print ("One hundred ");
}
 
 if ( sot == 2){
	
	System.out.print ("Two hundred ");
}

if ( sot == 3){
	
	System.out.print ("Three hundred ");
}

if ( sot == 4){
	
	System.out.print ("Four hundred ");
}
 
 if ( sot == 5){
	
	System.out.print ("Five hundred ");
}

if ( sot == 6){
	
	System.out.print ("Six hundred ");
}	

if ( sot == 7){
	
	System.out.print ("Seven hundred ");
}

if ( sot == 8){
	
	System.out.print ("Eight hundred ");
}

if ( sot == 9){
	
	System.out.print ("Nine hundred ");
}
}

if (des == 1){
	des1 = num % 100;
	if (des1 >10 && des1 < 20){
	 if ( des1 ==11){
	 System.out.println ("eleven.");
	 }
		 
		  if ( des1 ==12){
		 System.out.println ("twelve."); 
		  }
		  if ( des1 ==13){
		 System.out.println ("thirteen.");
		  }
		  if ( des1 ==14){
		 System.out.println ("fourteen.");
		  }
		  if ( des1 ==15){
		 System.out.println ("fifteen.");
		  }
		  if ( des1 ==16){
		 System.out.println ("sixteen.");
		  }
		  if ( des1 ==17){
		 System.out.println ("seventeen.");
		  }
		  if ( des1 ==18){
		 System.out.println ("eighteen.");
		  }
		  if ( des1 ==19){
		 System.out.println ("nineteen.");
		  }
	 }

if ( des == 2){
	
	System.out.print ("twenty ");
}

if ( des == 3){
	
	System.out.print ("thirty ");
}

if ( des == 4){
	
	System.out.print ("forty ");
}

if ( des == 5){
	
	System.out.print ("fifty ");
}

if ( des == 6){
	
	System.out.print ("sixty ");
}

if ( des == 7){
	
	System.out.print ("seventy ");
}

if ( des == 8){
	
	System.out.print ("eighty ");
}

if ( des == 9){
	
	System.out.print ("ninety ");
}
 if (des > 1){
if ( ed == 1){
	
	System.out.print ("one.");
}

if ( ed == 2){
	
	System.out.print ("two.");
}

if ( ed == 3){
	
	System.out.print ("three.");
}

if ( ed == 4){
	
	System.out.print ("four.");
}

if ( ed == 5){
	
	System.out.print ("five.");
}

if ( ed ==6){
	
	System.out.print ("six.");
}

if ( ed == 7){
	
	System.out.print ("seven.");
}

if ( ed == 8){
	
	System.out.print ("eight.");
}

if ( ed == 9){
	
	System.out.print ("nine.");
}
 }
}	
}	  
}