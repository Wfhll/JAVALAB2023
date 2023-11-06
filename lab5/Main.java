package lab5;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti datele angajatului");

        System.out.println("Introduceti numele:");
        e.setname(input.nextLine());
        System.out.println("Introduceti email:");
        e.setemail(input.nextLine());
        System.out.println("Introduceti hourrate:");
        e.sethourRate(input.nextLine());
        System.out.println("Introduceti capacity:");
        e.setcapacity(input.nextLine());
        System.out.println("Introduceti freedays:");
        e.setfreeDays(input.nextLine());
        e.calculateMonthlyIncome();
}
