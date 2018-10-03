import java.util.Scanner;

public class ReverseCipher{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Would you like to encrypt(e) or decrypt a message(d): ");
    String mode = scan.nextLine();
    System.out.println();

    System.out.println("Enter in message: ");
    String message = scan.nextLine();
    System.out.println();

    //System.out.println(message.charAt(2));

    if(mode.equals("e")){
      System.out.println("Encrypted message is: "+encrypt(message));
    }
    else if(mode.equals("d")){
      System.out.println("Decrypted message is: "+decrypt(message));
    }
  }

  private static String encrypt(String message){
    String encrypted="";
    for(int i=message.length()-1;i>=0;i--){
      encrypted += message.charAt(i);
    }
    return encrypted;

  }
  private static String decrypt(String message){
    String decrypted="";
    for(int i=message.length()-1;i>=0;i--){
      decrypted += message.charAt(i);
    }
    return decrypted;


  }
}
