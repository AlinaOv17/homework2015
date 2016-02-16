public class Buhuchet{
public static void main(String[] args){
	double sum = 0;
	int a =0;
	
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


	  // finding the amount of all salaries 
	  
	  for (int i = 0; i < worker.length; i++){
		sum += worker[i].getSalary();
}
	  System.out.println(" All salaries are " + sum); 
	  
	  // finding the min salary
	  
	  double min = worker[0].getSalary();
      for (int i = 0; i < worker.length; i++){
	   if(worker[i].getSalary() < min){
		min = worker[i].getSalary();
		a = i;
	   } 
	 }
	 System.out.println(" The min salary is  " + worker[a].toString());
	 
	 // finding the max salary
	 double max = worker[0].getSalary();
	 for (int i = 0; i < worker.length; i++){
	   if(worker[i].getSalary() > max){
		max = worker[i].getSalary();
		a = i;
		} 
	 }
	 
	 System.out.println(" The max salary is  " + worker[a].toString());
	
	//printing all the info about the employee
	 
	 System.out.println(" The data for  Name1 is  " + worker[0].toString()); 
	  
}

}


