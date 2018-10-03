import java.util.Scanner;

public class ceasarcipher{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Ask user if they wish to encrypt or decrypt a message
    System.out.println("Would you like to encrypt(e) or decrypt(d): ");
    String mode = scan.nextLine();
    System.out.println();

    //Get message to encrypt or decrypt
    System.out.println("Enter in your message: ");
    String message = scan.nextLine();
    System.out.println();

    //Ask user for key value for encryption and decryption
    //Must use same key for encryption and decryption
    System.out.println("What key value would you like to use: (0-25)");
    int key = scan.nextInt();
    System.out.println();

    //Print out statement for encryption or decryption
    if(mode.equals("e")){
      System.out.println("Encrypted message is: "+encrypt(message,key));
    }
    else if(mode.equals("d")){
      System.out.println("Decrypted messsage is: "+decrypt(message,key));
    }
  }

  /**
   * Ecryption method to encode message entered
   * @param  message user created message to encrypt
   * @param  key     key chosen by user for ecryption
   * @return         Returns string of encrypted Message
   */
  private static String encrypt(String message, int key){
    String encrypted="";
    //only have to work with lower case letters
    //easier for ascii value manipulation
    message = message.toLowerCase();

    //go through each character in message and encode 1 by 1
    for(int i=0;i<message.length();i++){
      int x = message.charAt(i);
      //System.out.print(x+" -> ");

      //don't worry about spaces
      if(x==32){
        encrypted +="";
      }
      else if(x>=97 && x<=122){
        //check if ascii value not associated with letter would be returned
        if(x+key>122){
          //wrap around the ascii table so after z it starts back at a
          x = (key-(122-x)) + 96;
        }
        else{
          //otherwise just add key to ascii value
          x+=key;
        }
      }
      //System.out.println(x);

      //Add char at x ascii value to encrypted message
      encrypted += (char)x;
    }
    return encrypted;
  }

  /**
   * Decrypt entered message
   * @param  message user entered message for decryption
   * @param  key     key chosen by user for decryption, must match key for encryption
   * @return         Returns decoded message
   */
  private static String decrypt(String message, int key){
    String decrypted ="";
    message = message.toLowerCase();

    for(int i=0;i<message.length();i++){
      int x = message.charAt(i);
      //System.out.print(x+" -> ");
      if(x==32){
        decrypted +="";
      }
      else if(x>=97 && x<=122){
        //this time wrap around from a to z
        if(x-key<97){
          x = 122-(key-(x-96));
        }
        else{
          x-=key;
        }
      }
      //System.out.println(x);
      decrypted += (char)x;
    }
    return decrypted;
  }



}
