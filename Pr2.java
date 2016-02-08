class Pr2{
public static void main(String[] args){

int a = Integer.parseInt(args[0]);
int g;
for ( g = 1; g <= a; g++){
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