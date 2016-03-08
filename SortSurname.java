import java.util.Comparator;

public class SortSurname implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String str1 = o1.getSurname();
		String str2 = o2.getSurname();
		return str1.compareTo(str2);
	}

}
