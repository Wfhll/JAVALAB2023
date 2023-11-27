package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("mar", "banana", "para", "para", "mar", "struguri");

        List<String> distinctList = listOfStrings.stream()
                .distinct()
                .collect(Collectors.toList());
        char literastart = 'p';

        long count = listOfStrings.stream()
                .filter(s -> s.startsWith(String.valueOf(literastart)))
                .count();
        List<String> ASC = listOfStrings.stream()
                .sorted().collect(Collectors.toList());
       // Collectors.toList();
        List<String> DESC = listOfStrings.stream()
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());
       // Collectors.toList();

        System.out.println("lista originala: " + listOfStrings);
        System.out.println("lista fara duplicate: " + distinctList);
        System.out.println("numar de cuvinte care incep cu litera " + literastart + ": " + count);
        System.out.println("lista sortata ascendent:" + ASC);
        System.out.println("lista sortata descendent:" + DESC);
    }

}








//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class SortLists {
//    public static void main(String[] args) {
//        List<String> listOfStrings = Arrays.asList("apple", "banana", "orange", "apricot", "grape", "kiwi");
//
//        // Sort the list in ascending order using Stream
//        List<String> ascendingOrder = listOfStrings.stream()
//                .sorted()
//                .toList(); // Note: This requires Java 16 or later, or you can use Collectors.toList() in earlier versions
//
//        // Sort the list in descending order using Stream
//        List<String> descendingOrder = listOfStrings.stream()
//                .sorted(Collections.reverseOrder())
//                .toList(); // Note: This requires Java 16 or later, or you can use Collectors.toList() in earlier versions
//
//        // Print the results
//        System.out.println("Original List: " + listOfStrings);
//        System.out.println("List in Ascending Order: " + ascendingOrder);
//        System.out.println("List in Descending Order: " + descendingOrder);
//    }
//}
  
