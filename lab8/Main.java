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

  
