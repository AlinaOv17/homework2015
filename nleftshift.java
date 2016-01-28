class nleftshift{
public static void main(String[]args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
int n = 3;
int i;
for (i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
    System.out.println(" ");
	// сдвиг влево
	// 2 3 4 5 6 7 8 9
	// 5 6 7 8 9 0 0 0 

	
for (i = 0; i < (array.length -n); i++){
			
	array[i] = array[i+n];
}

while ( i >= (array.length - n) && i <= (array.length -1)){
	 array[i] =0;
	 i++;
}
 
for ( i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}

}
}

