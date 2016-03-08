import java.util.Comparator;

public class SortName implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String str1 = o1.getName();
		String str2 = o2.getName();
		return str1.compareTo(str2);
		}

}