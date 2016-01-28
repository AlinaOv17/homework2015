class Rightcln{
public static void main(String[] args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
int n = 3;

// Sdvig Vpravo
for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
	System.out.println(" ");
        
        for (int i = 0; i < n; i++) {
            int k = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = k;
        }
		
		for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
}	
	
	
}