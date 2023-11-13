package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 //       Triangle triangle = new Triangle(5);
   //     Square square = new Square(6);
//
 //      triangle.desen();
 //       square.desen();
    List<Book> listaDeCarti = new ArrayList<>();
    List<String> listaDeStrings = new ArrayList<>();

    listaDeCarti.add(new Book("Book1", "Author1", "1213531"));
    listaDeCarti.add(new Book("Book2", "Author2", "1213532"));
    listaDeCarti.add(new Book("Book3", "Author3", "1213533"));

    Book Book1 = listaDeCarti.get(1);

    listaDeCarti.contains(Book1);

    listaDeCarti.forEach(element ->{
        System.out.println(element.getName());
        System.out.println(listaDeCarti.indexOf(element));
    });

    List<String> list = listaDeCarti.stream()
            .filter(e -> e.getISBN().length() > 10)
            .map(e -> e.getAuthor())
            .toList();
    }
}