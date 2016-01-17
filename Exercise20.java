class Exercise20{
public static void main(String[] args){
int x1 = Integer.parseInt (args[0]);
int y1 = Integer.parseInt (args[1]);
int x2 = Integer.parseInt (args[2]);
int y2 = Integer.parseInt (args[3]);

if (x1 > 8 && y1 > 8 && x1 < 1 && y1 < 1 && x2 > 8 && y2 > 8 && x2 < 1 && y2 < 1){
	System.out.println ("Please, enter a nummber from 1 to 8!");
}

if (x1 < 9 && y1 < 9 && x1 > 0 && y1 > 0 && x2 < 9 && y2 < 9 && x2 > 0 && y2 > 0){
	
if ( (x1 + y1) %2 == (x2 + y2) % 2 ) {
	
	System.out.println ("These fields are of the same color");
	
}

else {
	System.out.println ("These fields are not of the same color");
}
}
}
}