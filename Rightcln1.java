class Rightcln1{
public static void main(String[] args){
int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
int n = 3;
int i;
int temp =0;
// Sdvig Vpravo
for (i = 0; i <  array.length; ++i){
	System.out.print (array[i]);
	System.out.print(" ");
}
	System.out.println(" ");
	for (i = (array.length-1); i >= 0; i--){
	System.out.print (array[i]);
	System.out.print(" ");
	}
	System.out.println(" ");
        
     for (i = (array.length-n); i < array.length; i++){
		 System.out.print (array[i]);
	System.out.print(" ");
		 
	 }
	 			 

for (i =0; i < (array.length-n); i++){
	System.out.print (array[i]);
	System.out.print(" ");
}

}
		
}	