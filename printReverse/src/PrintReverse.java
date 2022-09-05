
// Class:             Data Structures Section 03
// Term:              Spring: 2022
// Name:              
// Program Number:    printReverse
// IDE:               Eclipse
// DATE:              01 22,2022

      /*
    The idea here is to print an entire string in reverse

    continueLoop: abc
    Process:
        REC_PRINT(string s):
            LENGTH = len(s)
            PRINT(S[length -1])
            REC_PRINT(S.SUBSTRING(0, S-1);
    Output: cba

     */

import java.util.Scanner;

class PrintReverse {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String continueLoop, stringToReverse;
    continueLoop = "Y";
  
    // Main loop for program execution
    while(continueLoop.equals("Y")){
      System.out.print("Entered string: ");
      stringToReverse = scanner.nextLine();
      printCharsReverse(stringToReverse);
      System.out.println("");
      System.out.print("Try Again? (Y/N): ");
      continueLoop = scanner.nextLine().toUpperCase();
      System.out.println("");

    }
    scanner.close();
  }
    public static void printCharsReverse(String s){
      // Helper method
      System.out.print("Reversed String: ");
      printCharsReverse(s, s.length());

  }
  public static void printCharsReverse(String s, int len){
    //Recursive method that actually performs the printing

      if (len==0){
          return;
      }
      System.out.print(s.charAt(len - 1));
      printCharsReverse(s.substring(0, len  - 1), len - 1);

  }
}
