class ExerciseStTest{
public static void main(String[] args){
String[] array = new String[10];
array[0] = "CCTGCGGAAGATCGGCACTAGAATAGCCAG";
array[1] = "AACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCC";
array[2] = "CACTAATAATTCTGAGG";
array[3] = "CACGCTTCCGTA";
array[4] = "CCTGCTTCCGGCGGA";
array[5] = "CAATTCTCTA";
array[6] = "CCTGCGGCACTAGAATAGA";
array[7] = "CACTCTAGAATAGCCAA";
array[8] = "CCTGCGGA";
array[9] = "CACTACACTAGAATAG";

for (int i = 0; i <array.length; i++){
	lineNum(array[i], 'C', 'G');
		System.out.println (lineNum(array[i], 'C', 'G'));
	
}


}


static double lineNum(String textt, char search, char search2){
	double times = 0;
	char ch;
	char ch2;
	char all;
	double times2 = 0;
	double per = 0;
	
	for (int i =0; i < textt.length(); i++){
		all = textt.charAt(i);
		if (search != all && search2 != all){
		times2++;}	
	}
		
   for (int i =0; i < textt.length(); i++){
		ch = textt.charAt(i);
		if (search == ch){
		times++;}	
}
	for (int i =0; i < textt.length(); i++){
		ch2 = textt.charAt(i);
		if (search2 == ch2){
		times++;}	
	
	}
	
	per = (times/(times+times2))*100;
	
	return per;

}
}

