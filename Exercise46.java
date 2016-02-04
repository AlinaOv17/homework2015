class Exercise46{
public static void main(String[] args){
int[] array = {2, 4, 8, 8, 11, 12, 12, 12, 15, 33, 48, 48, 50, 50, 60, 75};	
int n = 16;
for(int i=0; i<array.length; i++){
	System.out.print (array[i]);	
    System.out.print (" ");		
}	
    System.out.println (" ");	
	for(int i=1; i<array.length; i++){
		if (array[i] == array[i-1]){
			continue;
		}

		System.out.print (array[i]);
		 System.out.print (" ");	
}
}
}