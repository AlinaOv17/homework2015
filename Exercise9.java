class Exercise9{
public static void main(String[] args){
	double cons = Integer.parseInt (args[0]);
    double gals;
	double cons2;
    gals = cons / 3.875; // преобразовали литры в галлоны
	
    cons2 = 62.14 / gals;
	
	
	System.out.println("Miles per gallon of fuel " + cons2);
	
	
	
}

}