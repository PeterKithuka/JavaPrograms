import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rockScissorGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "scissor", "paper"};
        String playerChoise;
        String computerChoices;
        String playAgain = "Yes";

       do {
           System.out.println("Enter your choice(Rock,Scissor,Paper): ");
           playerChoise = s.nextLine().toLowerCase();

           if (!playerChoise.equals("rock") &&
                   !playerChoise.equals("scissor") &&
                   !playerChoise.equals("paper")) {
               System.out.println("Invalid choice");
           }
           computerChoices = choices[random.nextInt(3)];
           System.out.println("Computer choice: " + computerChoices);

           if (playerChoise.equals(computerChoices)) {
               System.out.println("You tied!");
           } else if ((playerChoise.equals("rock") && computerChoices.equals("scissor")) ||
                   (playerChoise.equals("scissor") && computerChoices.equals("paper"))||
                   (playerChoise.equals("paper") && computerChoices.equals("rock"))) {
               System.out.println("You win!");
               continue;
           }   else {
               System.out.println("You lose!");
           }
           System.out.println("Play again(yes/no: ");
           playAgain=s.nextLine().toLowerCase();
       }
       while(playAgain.equals("yes"));

        System.out.println("Thanks for playing");
    s.close();
    }
}
