class Exercise015{
public static void main(String[] args){
	
int N;
N = 28976;
System.out.println("From the beginning of the day seconds : "+ N );
int A = N / 3600; // полные часы с начала суток
System.out.println("From the beginning of the day full hours : "+ A );

int B = N % 3600; // кол-во оставшихся секунд 

int C = B / 60; // полных минут с начала последнего часа

int D = N / 60 + C;

System.out.println("Full minutes from the beginning of the day:" + D);	
}


}