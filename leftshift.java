class leftshift{
public static void main(String[]args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
    System.out.println(" ");
	// сдвиг влево
	// 2 3 4 5 6 7 8 9
	// 3 4 5 6 7 8 9 0

for (int i = 0; i < (array.length -1); i++){
	array[i] = array[i+1];
	
}
 
array[array.length-1] = 0;
for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}

}
}
