import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
     int x = 10;
     int y = x;
     if (x > 5) {
         if (x > 10) {
             y--;
         }
     } else {
         int z = x;
         if (y >= z) {
             z++;
         } else {
             z--;
         }
     }

     

   }
}
