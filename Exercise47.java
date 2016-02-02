class Exercise47{
	public static void main(String[] args){
	String text = "This is the text where to find a character";
	char find= 't';
	System.out.println (text);
       
	countChars( "This is the text where to find a character", 't'); 
	
		    
	static int countChars(String textt, char search){
	int times = 0;
	char ch;
	for (int i =0; i < textt.length(); i++){
		ch = textt.charAt(i);
		if (search == ch){
		times++;}
		}
	return times;
	System.out.println(times);
}
}
}