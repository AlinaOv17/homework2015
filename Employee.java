public class Employee implements Comparable<Employee>{
	 private int INN;
		private String name;
		private String surname;
		private double salary;
		
		public Employee(int INN, String name, String surname, double salary) {
			this.INN = INN;
			this.name = name;
			this.surname = surname;
			this.salary = salary;
		}
		public int getINN() {
			return INN;
		}
		
		public String getName() {
			return name;
		}
		
		public String getSurname() {
			return surname;		
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setINN(int INN) {
		this.INN = INN;	
		}
		public void setName(String name) {
			this.name = name;
		}
	    public void setSurname(String surname) {
			this.surname = surname;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public void data() {
			System.out.print(getINN() + " ");
			System.out.print(getName() + " ");
			System.out.print(getSurname() + " ");
			System.out.println(getSalary() + " ");
		}
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}
		
		public int compareTo(Employee e){
		double salComp = this.salary;
		Employee o = (Employee) e ;
		double salO = o.getSalary();
		if(salComp < salO) return -1;
		if (salComp > salO) return 1;
			
		return 0;
		}
}
	
		
		

		

