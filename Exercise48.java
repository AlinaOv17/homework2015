class Exercise48{
public static void main(String[] args){
int a =4;
int b =15;
int c =1;
determ(4, 15, 1);

public static int determ(int[] array){
	int min = array[0];
	for (int i =0; i < array.length; i++){
		if (array[i]< array[0]){
			int min = array[i];
		}
	return min;
}
System.out.println ("The smallest is " + min);
}
}
}