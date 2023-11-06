package lab5;

public class Cat {
    private String name;

    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    private Integer energylevel;    // 1-5

    private Integer hungerlevel;    // 1-5

    private Integer moodlevel; // 1-5
    public Cat(String name, String colour, Integer age){
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.energylevel = 3;
        this.hungerlevel = 3;
        this.moodlevel = 3;
    }
    public void play(){
        this.moodlevel++;
        this.energylevel--;
        this.meow();
    }
    public void feed(){
        this.hungerlevel++;
        this.moodlevel++;
        this.meow();
    }
    public void sleep(){
        this.energylevel++;
        this.hungerlevel++;
    }
    public void meow(){
        System.out.println("Meow");
    }
}
