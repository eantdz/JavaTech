import java.lang.String;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    // Set constructor for Human name and age
    public Human (String name, int age) {
        this.age = age;
        this.name = name;
    }
    // Setters and getters begin
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    // Setters and getters end 
    //---
    // Methods for Human
    void sayHello () {
        System.out.printf("Hello! My name is %s. I'am %d year's old..", this.name, this.age);
    }
    
}