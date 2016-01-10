// Упражнение 15
class Exercise15{
public static void main(String[] args){
int N;
N = 28976;
System.out.println("From the beginning of the day seconds : "+ N );
int A = N / 3600; // полные часы с начала суток
System.out.println("From the beginning of the day full hours : "+ A );

int B = N % 3600; // кол-во оставшихся секунд 
System.out.println(" Full seconds :" + B);

int C = B / 60;
System.out.println("Full minutes:" + C);

}


}