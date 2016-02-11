class Factorial{
public static void main(String[] args){
int a = Integer.parseInt(args[0]);
System.out.println("Factorial of your number is  " + f(a));
}
static public int f(int n){
	int result =0;
	if(n==0){
	result = 1;
	}
	else if(n==1){
	result = 1;
	}
	else{
	result = f(n-1)*n;
	}
	return result;	
}

}