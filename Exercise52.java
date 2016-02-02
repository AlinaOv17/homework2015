class Exercise52{
public static void main(String[] args){
int[] array = {5, 3, 9};
for( int i=0; i<array.length; i++){
System.out.print (array[i]);	
System.out.print (" ");		
}

public static int quatSum(int[] array){
	int min = array[0];
	int max = 0;
	for (int i =0; i < array.length; i++){
		if (array[i]< array[0]){
			int min = array[i];
		}
		if(array[i] > min){
			int max = array[i];
		}
		if( array[i] > min && array[i] < max){
			int max2 = array[i];
					}
	return ((max*max)+(max2*max2));
}
System.out.println ("The smallest is " + min);
}
	
}
}