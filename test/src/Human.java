import java.lang.String;

public class Human {
    // Environment
    private String name, lastname;
    private int age;
    // Constructor of Human 
    public Human (String name, String lastname, int age) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }
    // Setters and getters begin
    void setName (String name) {
        this.name = name;
    }
    void setLastName (String lastname) {
        this.lastname = lastname;
    }
    void setAge (int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    String getLastName() {
        return lastname;
    }
    int getAge() {
        return age;
    }
    // Setters and getters end

    // Method sayHello by StringBuilder. 
    void sayHello () {
        StringBuilder sayHello = new StringBuilder("Hello! My name is ");
        sayHello.append(name).append(" ").append(lastname);
        System.out.println(sayHello);
    }

    // Method sayGoodBye by StringBulder.
    void sayGoodBye () {
        StringBuilder sayGoodBye = new StringBuilder("Glad to see you. By ");
        sayGoodBye.append(name + " " + lastname);
        System.out.println(sayGoodBye);
    }
}
