public class Buhuchet{
public static void main(String[] args){
	
Empl[] worker = new Empl[10];
worker[0] = new Empl(123890990, "Name1", " Surname1", 1500);
worker[1] = new Empl(345533465, "Name2", " Surname2", 3000);
worker[2] = new Empl(927490217, "Name3", " Surname3", 1200);	
worker[3] = new Empl(357657545, "Name4", " Surname4", 600);	
worker[4] = new Empl(807096786, "Name5", " Surname5", 850);	
worker[5] = new Empl(132354365, "Name6", " Surname6", 320);	
worker[6] = new Empl(678658768, "Name7", " Surname7", 637);	
worker[7] = new Empl(235436578, "Name8", " Surname8", 564);	
worker[8] = new Empl(465768799, "Name9", " Surname9", 1009);	
worker[9] = new Empl(132243679, "Name10", " Surname10", 1201);
     // report about one worker
	 System.out.println(" The data for  Name1 is  " + worker[0].toString()); 
	
	 // printing all salaries
	 System.out.println("All salaries are " + allSal(worker));
	 
	 // printing the min salary
	  System.out.println("The min salary is " + worker[minSal(worker)].toString() );
	  
      // Printing the max salary
	  System.out.println("The max salary is " + worker[maxSal(worker)].toString() );
	
	  // report about all workers
	  
	     for( int i = 0; i < worker.length; i++){
	   System.out.println(" " + worker[i].toString()); 
    }
	   
}

     // finding the amount of all salaries 
	  
	public static double allSal(Empl[] a){
	double sum = 0;
	
	  for (int i = 0; i < a.length; i++){
		sum += a[i].getSalary();
	  }
	  return sum;
}

	  
	  // finding the min salary
	  
	  public static int minSal(Empl[] b){
	  int a =0;	
	  double min = b[0].getSalary();
      for (int i = 0; i < b.length; i++){
	   if(b[i].getSalary() < min){
		min = b[i].getSalary();
		a = i;
	   } 
	 }
	 return a;
	  }
	 
	 // finding the max salary
	 public static int maxSal(Empl[] c){
		 int a = 0;
	 double max = c[0].getSalary();
	 for (int i = 0; i < c.length; i++){
	   if(c[i].getSalary() > max){
		max = c[i].getSalary();
		a = i;
		} 
	 }
	 return a;

}
}