import java.lang.String;
import java.util.Scanner;

public class Man extends Human {
    private char gender;
    

    public Man(String name, int age, char gender) {
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
        if (this.gender == 'M') {
            System.out.print("My gender is man");
        } else {
            System.out.print("ERROR: Undefined gender.");
        }
    }

}
