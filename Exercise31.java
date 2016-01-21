class Exercise31{
public static void main(String[] args){
	int a = Integer.parseInt (args[0]);
	int b = Integer.parseInt (args[1]);
	int sumq = 0;
	if ( a < b){
	for ( int i = a; i <= b; i++){
			sumq += i*i;
	}			
		
		System.out.println("The sum of squares of numbers is " + sumq);
	}
	
	if ( a > b){
	for ( int i = b; i <= a; i++){
			sumq = i*i;
	}			
		
		System.out.println("The sum of squares of numbers is " + sumq);
}
}
}