
public class FabrikaManager extends Employee implements Comparable<Employee> {
	private double bonus = 500;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	

	public String toString() {
		return super.toString() + " + bonus=" + bonus + " ";
	}

	public FabrikaManager(int INN, String name, String surname, double salary) {
		super(INN, name, surname, salary);
	}
	
	

}
