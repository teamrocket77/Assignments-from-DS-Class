import java.io.Compararator;
import java.lang.Comparable;
// Class:             Data Structures Section 03
// Term:              Spring: 2022
// Name:              
// Program Number:    EofComp
// IDE:               Eclipse
// DATE:              02 10,2022
// JRE: 	      15.0.1
import java.util.Comparator;


class EofComp{
    /* 
    *   Comparable -> uses the compareTomethod
    *   Compararator -> uses the compare method
    */

    public class CT implements Comparable<String>{
        @Override
        public int compareTo<(String s1, String s2){
            return s1.length() - s2.length();
        }
    }
    public class Loan implements Comparable<String>{
        public int interestRate;
        public int timeInMonths;
        public int amountBorrowed;
        public Loan(){

        }

        @Override
        public int compareTo(Loan l2){
            return Math.pow(interestRate*amountBorrowed, interestRate) - Math.pow(l2.interestRate*l2.amountBorrowed, l2.interestRate) ;
        }
        public Loan(int i, int t, int a){
            interestRate = i;
            timeInMonths = t;
            amountBorrowed = a;
        }
    }

    public static Comparator<Integer> comparing(Loan l1, Loan l2){
        return l1.compareTo(l2);
    }
        public static void main(String[] args){

    }
}