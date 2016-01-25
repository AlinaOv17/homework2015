import java.util.Scanner;
 
public class Exercise057 {
    public static void main(String[] args) {
 
        int[] a = new int[100];
        int aLength = a.length;
        int rand = (int) (Math.random() * aLength);
        int x = rand;
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
        System.out.println("You guessed the number " + x);
		System.out.println("You tried " + tries);
      
    }
}