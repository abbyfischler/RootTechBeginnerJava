import java.util.ArrayList; 
import java.util.Scanner;

public class Driver{
  public static void main(String[] args ) {
    GambilingGame game = new GambilingGame();
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> bets = new ArrayList<>();
    System.out.println("Enter a number to bet on (Press Enter after each):");
    int guess = input.nextInt();
    ArrayList<Integer> winNumbersStorage = game.getWinNumbers();
    while(game.balance >= 1 && game.balance <= 100){
      for(int winNum: winNumbersStorage){
        if (guess == winNum){
          System.out.println("You have a winning number");
          game.balance += 5;
          break;
        }
        System.out.println("Sorry, but you don't have another number");
      }
      System.out.println("Your current balance is" + game.balance + "\n what number would you like to bet on?");
      guess = input.nextInt();
      game.numberShuffles();
      winNumbersStorage = game.getWinNumbers();
    }
    if(game.balance >= 100){
        System.out.println("Your current balance is" + game.balance + ". You won!!"); 
      }
    else if(game.balance <= 1){
      System.out.println("Your current balance is" + game.balance + ". You lost!!");
    }
  }
}