public class Empl{
    private int INN;
	private String name;
	private String surname;
	private double salary;
	
	public Empl(int INN, String name, String surname, double salary) {
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
	
	public String toString() {
		return "name=" + name + surname + ", salary=" + salary + " ";
	}
}
	
	

	
	
