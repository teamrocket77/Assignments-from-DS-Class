import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

// Class:             Data Structures Section 03
// Term:              Spring: 2022
// Name:              
// Program Number:    ComparatorTesting
// IDE:               Eclipse
// DATE:              02 10,2022
// JRE: 	      15.0.1

class ComparatorTesting{
    public class C implements Comparator<String>{  
        @Override
        public int compare(String s1, String s2){
            return s1.length() - s1.length();
        }
    }
    public static Comparator<String> comparing(Function<String, Integer> f){
        return (s1, s2) -> f.apply(s1).compareTo(f.apply(s2));
    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Atlanta");
        list.add("Savannah");
        list.add("New york");
        list.add("Dallas");
        // list.sort(String::compareToIgnoreCase); uses a function reference to compare and ignore case
        // list.sort((s1, s2) -> s1.compareToIgnoreCase(s2)); // uses an actual lambda expression to compare function
        // list.sort(Comparator.comparing(e -> e.length())); // this makes an anonmyous function and uses the e.leng
        // list.sort(comparing(String::length)); // this uses the locally available function
        System.out.println(list);
    }
}