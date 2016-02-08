class Triangle{
public static void main(String[] args){

int a = Integer.parseInt(args[0]);
int g;
for ( g = a; g > 0; g--){
	Stars(g);
	System.out.println(" ");
	
}
}
static void Stars(int numSt){

for ( int i = 0; i < numSt; i++){
	System.out.print ('*');
	
}	

}
}
