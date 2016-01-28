class Cloopr{
public static void main(String[]args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
    System.out.println(" ");

	// Циклический сдвиг вправо
	//2 3 4 5 6 7 8 9  
    //0 2 3 4 5 6 7 8
	int a = array[array.length-1];
for (int i = (array.length-1); i > 0; i--){
	array[i] = array[i-1];
	
}
array[0] = a;

for (int i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}

}
}