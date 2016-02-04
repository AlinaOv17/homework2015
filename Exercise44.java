class Exercise44{
public static void main(String[] args){
int[] array = {2, 4, 33, 51, 7, 18, 15, 21, 22, 3};
int K =19;
int i; 
int num =0;
int bigger = array[0];
for ( i = 0; i <  array.length; ++i){
	
	if ( array[i] > K){
	    bigger = array[i];
	    num = i;	
}
}
System.out.println(" ");
System.out.println ("The number is " + bigger);
System.out.println ("It`s serial number is " + (num +1));
}	
}