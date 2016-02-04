class Exercise51{
public static void main(String[] args){
int[] array = {5, 15, 20, 25, 30, 35};
for( int i=0; i<array.length; i++){
System.out.print (array[i]);	
System.out.print (" ");		
}
System.out.println();
double b = avgArray(array);
System.out.print("The average array is " + b);
}
static double avgArray(int[] a){
	double sum =0;
	double avg =0;
	
	for ( int i=0; i<a.length; i++){
		sum+=a[i];
		avg=sum/a.length;
	}
	return avg;
	
}
}