import java.util.Scanner;
 
public class Exercise057 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100) + 1; // random number
        int tries = 0;
        int guess;
		Scanner sc = new Scanner(System.in);
		boolean win = false;
		System.out.println("Guessed numb " + x);
		
		while (win == false) {
            System.out.println( "Type the number : " );
            guess=sc.nextInt();
            tries++;
             
        if (guess == x) {
                win = true;
            } 
        else if (guess < x) {
                System.out.println("Try again - guessed number is bigger!");
            }
        else if (guess > x) {
                System.out.println("Try again - guessed number is smaller!");
            }
        }
		if (tries < 3){
			
			System.out.println("You guessed a number, but looks like you're a cheater!");
			System.out.println("You tried " + tries);
		}
		else if(tries >= 3 && tries < 7){
		System.out.println(	"Congrats, you guessed a number " + x);
	    System.out.println("You tried " + tries);
		}
        else if (tries >=7){
			System.out.println("You guessed a number, but can be better!");
            System.out.println("You tried " + tries);
			
		}
      
    }
}