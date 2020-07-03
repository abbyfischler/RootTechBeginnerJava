import java.util.Scanner; //remember to import 
public class excercise1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(input); 
    
    System.out.println( "input = " + input );
    //scanner 2 print out any number you input
    Scanner scan1 = new Scanner(System.in);
    int a = scan1.nextInt();
    System.out.println(a); 
    
    System.out.println("input = " + a);
  }
}