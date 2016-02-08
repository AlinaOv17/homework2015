class Loss{
public static void main(String[] args){
    int[] mas ={3, 2, 4, 2, 1, 5};
    System.out.println ("The maximum loss is " + maxLoss(mas));
}

static int maxLoss(int[] array){
	int odd = 0;
	int max = (array[0] - array[1]);
	for (int i = 0; i < array.length-1; i++){
		for (int j = array.length-1; j > i; j--){
			if ((array[i] - array[j]) > max){
				max = (array[i] - array[j]);
			}
			
		}
	}
	return 	max;
}

}

