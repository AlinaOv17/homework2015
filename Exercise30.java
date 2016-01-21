class Exercise30{
public static void main(String[] args){
	int a = Integer.parseInt (args[0]);
	int b = Integer.parseInt (args[1]);
	int pr = 1;
	if ( a < b){
	for ( int i = a; i <= b; i++){
			pr *= i;
	}			
		
		System.out.println("The multiplication of numbers is " + pr);
	}
	
	if ( a > b){
	for ( int i = b; i <= a; i++){
			pr*= i;
	}			
		
		System.out.println("The multiplication of numbers is " + pr);
}
}
}