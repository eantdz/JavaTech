import java.lang.String;
import java.util.Scanner;

public class Woman extends Human {
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
            System.out.print("My gender is woman");
        } else {
            System.out.print("ERROR: Undefined gender.");
        }
    }

}
