class Leftcln{
public static void main(String[] args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
int n = 3;
// Sdvig vlevo
for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
	System.out.println(" ");
        
        for (int i = (array.length -1); i >= (array.length -n); i--) {
            int k = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = k;
        }
		
		for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
}	
	
	
}