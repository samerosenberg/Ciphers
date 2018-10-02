import java.util.Scanner;

public class ceasarcipher{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to 'encrypt' or 'decrypt': ");
    String mode = scan.next();
    
    System.out.println("Enter in your message: ");
    String message = scan.nextLine();
    
    System.out.println("What key value would you like to use: (0-25)");
    int key = scan.nextInt();
  }
  //create encrypt and decrypt methods 
}
