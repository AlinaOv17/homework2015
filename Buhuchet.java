import java.util.Arrays;


public class Buhuchet{
public static void main(String[] args){
	
Employee[] worker = new Employee[10];
worker[0] = new Employee(123890990, "Mark", " Surname1", 1500);
worker[1] = new Employee(345533465, "Tom", " Surname2", 3000);
worker[2] = new Employee (927490217, "Rob", " Surname3", 1200);	
worker[3] = new Employee(357657545, "Susanna", " Surname4", 600);	
worker[4] = new Employee(807096786, "Alice", " Surname5", 850);	
worker[5] = new Employee(132354365, "Greg", " Greg", 320);	
worker[6] = new Employee(678658768, "Garry", " Garry", 637);	
worker[7] = new Employee(235436578, "Andrew", " Andrew", 564);	
worker[8] = new Employee(465768799, "Steve", " Steve", 1009);	
worker[9] = new Employee(132243679, "Bill", " Bill", 1201);


    // creating the String[] of names for the further sorting
    // String[] names = {"Mark", "Tom", "Rob", "Susanna", "Alice", "Greg", "Garry", "Andrew", "Steve", "Bill"};
    
	// Sorting out the names
	//Arrays.sort(names);
	
	// printing the result
	//for(String sorted:names){
	//	System.out.print(" " + sorted);		
	//}
	//System.out.println(" ");
	
	// creating the int[] of inns for sorting
//int[] inns = {123890990, 345533465, 927490217, 357657545, 807096786, 132354365, 678658768, 235436578, 465768799, 132243679};
	
	// sorting them out
//	Arrays.sort(inns);
	
//	//printing the result	
//	for(int innSort:inns){
//		System.out.print(" " + innSort);		
//	}
//	System.out.println(" ");
//		 
//	 // report about one worker
//	 System.out.println(" The data for  Name1 is  " + worker[0].toString()); 

	
	 // printing all salaries
	 System.out.println("All salaries are " + allSal(worker));
	 
	 // printing the min salary
	  System.out.print("The min salary is " + worker[minSal(worker)].getSalary());
	  worker[minSal(worker)].data();
	  
      // Printing the max salary
	  System.out.println("The max salary is " + worker[maxSal(worker)].getSalary() );
	
	  // report about all workers
	  
	     for( int i = 0; i < worker.length; i++){
	   System.out.println(" " + worker[i].toString() + " = " + worker[i].getSalary()); 
    }
	     
	     System.out.println("Sort by Salary !!!!!!!");
	     Arrays.sort(worker);
	     report(worker);
	     
	     System.out.println("Sort by name !!!!!!!");
	     Arrays.sort(worker, new SortName());
	     report(worker);
	     
	     System.out.println("Sort by surname !!!!!!!");
	     Arrays.sort(worker, new SortSurname());
	     report(worker);
}

public static void report(Employee[] e){
	for(Employee i: e){
System.out.println("name: " + i.getName() + "Surname : " + i.getSurname() + "INN " + i.getINN() + " salary: " + i.getSalary());
	}	
	
}

     // finding the amount of all salaries 
	  
	public static double allSal(Employee[] a){
	double sum = 0;
	
	  for (int i = 0; i < a.length; i++){
		sum += a[i].getSalary();
	  }
	  return sum;
}
	  
	  // finding the min salary
	  
	  public static int minSal(Employee[] b){
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
	 public static int maxSal(Employee[] c){
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
	
		
		
		
		
	
		




