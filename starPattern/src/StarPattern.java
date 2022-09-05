// Class:             Data Structures Section 03
// Term:              Spring: 2022
// Name:              
// Program Number:    starPatternCardler
// IDE:               Eclipse
// DATE:              01 22,2022

/*
input: an integer called ROWS
process: 
	BASE CASE = 0:
		return 
	BASE CASE = 1:
		PRINT * 
		RETRUN
	currentRow = 0
    WHILE currentRow < ROWS
            GET difference between currentRow and desired amount
            PRINT whitespace 'difference' amount of times on both sides of the *
        
            if currentRow > 1
                PRINT currentRow + currentRow - 1 amount of stars
output: Pyramid of stars
*/

import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args){
        int RowsOfStars = 0; String continueLoop;
        continueLoop = "Y";
        Scanner scanner = new Scanner(System.in);
        
        //Main loop for getting user input and asking continuing execution
        while(continueLoop.equals("Y")){
            System.out.print("Enter Number of Rows: ");
            RowsOfStars = scanner.nextInt();
            PrintStars(RowsOfStars);
            scanner.nextLine();
            System.out.println("");
            System.out.print("Try Again? (Y/N): ");
            continueLoop = scanner.nextLine().toUpperCase();
        }

        scanner.close();
        
    }
    public static void PrintStars(int Rows){
    	//handling of most simple BASE CASE
        if (0==Rows){return;}
        PrintStars(Rows, 1);
    }
    public static void PrintStars(int Rows, int currRow){
        int CurrRowsDiff = Rows - currRow + 1;
        if (currRow > Rows){
            return;
        }
        PrintNTimes(" ", CurrRowsDiff);
        
        
        if(currRow>1) {
        	PrintNTimes("*", currRow + currRow - 1);
        	}
        else {
        	PrintNTimes("*", currRow);
        	}
        PrintNTimes(" ", CurrRowsDiff);
        System.out.println("");
        PrintStars(Rows, currRow + 1);
    }

    //separate methods to handle printing when  a char is passed 
    public static void PrintNTimes(String s, int times){
        if (times == 0){
            return;
        }
        System.out.print(s);
        PrintNTimes(s, times - 1);
    }
}