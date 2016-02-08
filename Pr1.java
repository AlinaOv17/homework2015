class Pr1{
public static void main(String[] args){

int a = Integer.parseInt(args[0]);

for ( int i = 0; i < a; i++){
	Stars(a);
	System.out.println(" ");
	
}

}
static void Stars(int numSt){

for ( int i = 0; i < numSt; i++){
	System.out.print ('*');
	
}	
		
}

}