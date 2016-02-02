class Exercise51{
public static void main(String[] args){
int[] array = {5, 15, 20, 25, 30, 35};
for( int i=0; i<array.length; i++){
System.out.print (array[i]);	
System.out.print (" ");		
}

System.out.print("average array is " + avgArray);

static int avgArray(int[] a){
	int sum =0;
	int avg =0;
	for ( int i=0; i<array.length; i++){
		sum+=array[i];
		avg=sum/array.length;
	}
	return avg;
	
}
}
}