class Exercise29{
public static void main(String[] args){
	int a = Integer.parseInt (args[0]);
	int b = Integer.parseInt (args[1]);
	int sum = 0;
	if ( a < b){
	for ( int i = a; i <= b; i++){
			sum += i;
	}			
		
		System.out.println("The sum of numbers is " + sum);
	}
	
	if ( a > b){
	for ( int i = b; i <= a; i++){
			sum += i;
	}			
		
		System.out.println("The sum of numbers is " + sum);
}
}
}