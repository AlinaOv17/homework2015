class nrightshift{
public static void main(String[]args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
int n = 3;
int i;
for ( i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
    System.out.println(" ");

	// сдвиг вправо
	//2 3 4 5 6 7 8 9  
    //0 0 0 2 3 4 5 6 
for (i = (array.length-1); i >= n; i--){
	array[i] = array[i-n];
	
}

while ( i >=0 && i < n){
	array[i] = 0;
    i--;
	
}


for ( i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}

}
}