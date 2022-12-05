import java.lang.String;
import java.util.Scanner;

public class Woman extends Human implements Interfaces.HumanInterface {
    private char gender;
    

    public Woman(String name, int age, char gender) {
        super(name, age);
        this.gender = gender;
    }
    
    void setGender(char gender) {
        this.gender = gender;
    }
    char getGender() {
        return gender;
    }
    void sayGender() {
        if (this.gender == 'F') {
            System.out.print("Okay.. Your gender is WOMAN.");
        } else {
            System.out.print("ERROR: Undefined gender.");
        }
    }
    public void myGengerIs() {
        System.out.print("My gender is: " + this.gender);
    }
    public void myNameIs() {
        System.out.print("My name is: " + super.getName());
    }
    public void myAgeIs() {
        System.out.print("My age is: " + super.getAge());
    }


}
