package lab5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      /*  Cat firstCat= new Cat("TOM", "gray", 6);
        Cat secondCat= new Cat("Mirel", "black", 9);

        firstCat.meow();
        firstCat.feed();
        firstCat.sleep();

        firstCat.getAge();
        firstCat.getColour();
        firstCat.getName();

    */
//   Employee employee1 = new Employee("Mihail", "Mihailut", 10, 8, 9);
//    employee1.calculateMonthlyIncome();
//
//    }
        Employee e = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti datele angajatului");

        System.out.println("Introduceti numele:");
        e.setName(input.nextLine());
        System.out.println("Introduceti email:");
        e.setEmail(input.nextLine());
        System.out.println("Introduceti hourrate:");
        e.setHourRate(input.nextInt());
        System.out.println("Introduceti capacity:");
        e.setCapacity(input.nextInt());
        System.out.println("Introduceti freedays:");
        e.setFreeDays(input.nextInt());
        e.calculateMonthlyIncome();
}}
