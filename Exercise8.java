class Exercise8{
public static void main(String[] args){
	double km = Integer.parseInt (args[0]);
	double L = Integer.parseInt (args[1]);
	double price = Integer.parseInt (args[2]);
	double A;
	double B;
	A = (L / km) * 100; // расход топлива на 100 км
	B = (L / km) * price; // средняя стоимость 1 км пути
	
	System.out.println("Fuel consumption for 100 km " + A);
	System.out.println("Average price for 1 km " + B);
	
}


}

