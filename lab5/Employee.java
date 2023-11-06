package lab5;

public class Employee {
    private String name;
    private String email;
    private Integer hourRate; //income
    private Integer capacity; //work hours/day
    private Integer freeDays;

    private Integer calculateDailyIncome(){
       return hourRate * capacity;
    }
    public void calculateMonthlyIncome(){
       System.out.println(calculateDailyIncome() * (21 - freeDays));
    }

    public Employee(String name, String email, Integer hourRate, Integer capacity, Integer freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }
}
