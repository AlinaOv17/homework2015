class Exercise261{
public static void main(String[] args){
int num = Integer.parseInt (args[0]);
int sot, des, ed, des1;
if ( num > 999 || num < 100){
	System.out.println("Пожалуйста, введите числа от 100 до 999");
}

 ed = num % 10; // единицы
 des = ((num % 100) -ed) / 10; // десятки
 sot = ((num % 1000) - (num % 100)) / 100; // sotni

if ( sot == 1){
	
	System.out.print ("Сто ");
}
 
 if ( sot == 2){
	
	System.out.print ("Двести ");
}

if ( sot == 3){
	
	System.out.print ("Триста ");
}

if ( sot == 4){
	
	System.out.print ("Четыреста ");
}
 
 if ( sot == 5){
	
	System.out.print ("Пятьсот ");
}

if ( sot == 6){
	
	System.out.print ("Шестьсот ");
}	

if ( sot == 7){
	
	System.out.print ("Семьсот ");
}

if ( sot == 8){
	
	System.out.print ("Восемьсот ");
}

if ( sot == 9){
	
	System.out.print ("Девятьсот ");
	
}

if (des == 1){
	des1 = num % 100;
	if (des1 >10 && des1 < 20){
	 if ( des1 ==11){
	 System.out.println ("одиннадцать.");
	 }
		  if ( des1 ==12){
		 System.out.println ("двенадцать."); 
		  }
		  if ( des1 ==13){
		 System.out.println ("тринадцать.");
		  }
		  if ( des1 ==14){
		 System.out.println ("четырнадцать.");
		  }
		  if ( des1 ==15){
		 System.out.println ("пятнадцать.");
		  }
		  if ( des1 ==16){
		 System.out.println ("шестнадцать.");
		  }
		  if ( des1 ==17){
		 System.out.println ("семнадцать.");
		  }
		  if ( des1 ==18){
		 System.out.println ("восемнадцать.");
		  }
		  if ( des1 ==19){
		 System.out.println ("девятнадцать.");
		  }
	 }

if ( des == 2){
	
	System.out.print ("двадцать ");
}

if ( des == 3){
	
	System.out.print ("тридцать ");
}

if ( des == 4){
	
	System.out.print ("сорок ");
}

if ( des == 5){
	
	System.out.print ("пятьдесят ");
}

if ( des == 6){
	
	System.out.print ("шестьдесят ");
}

if ( des == 7){
	
	System.out.print ("семьдесят ");
}

if ( des == 8){
	
	System.out.print ("восемьдесят ");
}

if ( des == 9){
	
	System.out.print ("девяносто ");
}
 if (des > 1){
if ( ed == 1){
	
	System.out.print ("один.");
}

if ( ed == 2){
	
	System.out.print ("два.");
}

if ( ed == 3){
	
	System.out.print ("три.");
}

if ( ed == 4){
	
	System.out.print ("четыре.");
}

if ( ed == 5){
	
	System.out.print ("пять.");
}

if ( ed ==6){
	
	System.out.print ("шесть.");
}

if ( ed == 7){
	
	System.out.print ("семь.");
}

if ( ed == 8){
	
	System.out.print ("восемь.");
}

if ( ed == 9){
	
	System.out.print ("девять.");
}
 }
}	
}	  
}