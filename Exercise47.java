class Exercise47{
	static int countChars(String textt, char search){
	int times = 0;
	char ch;
	for (int i =0; i < textt.length(); i++){
		ch = textt.charAt(i);
		if (search == ch){
		times++;}
		}
		return times;
	}
	
	public static void main(String[] args){
      
	System.out.println(" " + countChars("This is the text where to find a character", 'i'));
}	
}