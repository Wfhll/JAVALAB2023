package lab7;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //  problema1_var1();
        // problema2_var1();
        // problema1_var2();
         problema2_var2();
    }

    public static void problema1_var1() {
        List<Integer> numereIntregi = Arrays.asList(3, 8, 43, 65, 27, 76);
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n -> {
            sum.set(sum.get() + n);
        });
        System.out.println(sum.get() / numereIntregi.size());
    }

    public static void problema1_var2() {
        List<Integer> numereIntregi = Arrays.asList(3, 8, 43, 65, 27, 76);

        double v = numereIntregi.stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(v);
    }
    // convertiti o list string in uppercase

    public static List<String> upperOfList(List<String> lista) {
        lista.forEach(e -> {
            lista.set(lista.indexOf(e), e.toUpperCase());
        });
        return lista;
    }

    public static void problema2_var2() {
        List<String> lista = Arrays.asList("pere", "mere", "prune");
        List<String> newList = lista.stream()
                .map(L -> L.toUpperCase())
                .collect(Collectors.toList());
            System.out.println(newList);
    }
}