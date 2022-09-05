import java.util.Arrays;
import java.util.Scanner;
//Class:             Data Structures Section 03
//Term:              Spring: 2022
//Name:              
//Program Number:    averageGrade
//IDE:               Eclipse
//DATE:              01 22,2022
/* 
    input: list of strings [100 50 30]
    process: 
        BASE CASE 0: If there are no numbers passed then return a 0
        BASE CASE 1: return the number
        BASE CASE 2: return the number divided by two
            CASE > 2:
                [getting the number from base case 2]  
                input should be scaled from .5 to .66 and should be the current number divided by 1-.66

    output: a form of output 
*/ 
class AverageGrade {
	
	
	// Main method
    public static void main(String[] args){
    	int ClassSize;
    	String[] ClassGradesString;
        String ContinueLoop = "Y";
        Scanner scanner = new Scanner(System.in);
        
        
        // Loop to be ran for continuous testing or tries
        while(ContinueLoop.equals("Y")){
            System.out.print("Class size: ");
            ClassSize = scanner.nextInt();
            scanner.nextLine();
            ClassGradesString = new String[ClassSize];
            System.out.print("Entered Grades: ");
            ClassGradesString = scanner.nextLine().split(" ");
            System.out.println(findAverage(ClassGradesString, ClassSize));
            System.out.print("Continue? (Y/N): ");
            ContinueLoop = scanner.nextLine().toUpperCase();
        }
        scanner.close();
    }


    public static double findAverage(String[] strarr, int stringArrayLength){
        int counter = 0 ;
        if (stringArrayLength == 0){
            return 0.00;
        }
        
        // initialize new integer array from the array of strings
        int[] intarr = new int[stringArrayLength];
        while (counter!=stringArrayLength){
            intarr[counter] = Integer.parseInt(strarr[counter]);
            counter++;
        }

        //overloaded method call
        return findAverage(intarr, (double )intarr.length);
    }
    public static double findAverage(int[] intarr, double len){
    	
    	//handling of more complex base cases
        if (len == (double)1){
            return (double)intarr[0];
        }

        if (len == (double)2){
            return (double)(intarr[0]+intarr[1])/2;
        }
        //reducing the integer array size
        int[] arr = Arrays.copyOfRange(intarr, 1, intarr.length );

        return ( (1/len) / (1/(len - 1)) * findAverage(arr, len - 1) + intarr[0]/len);
    }
}
