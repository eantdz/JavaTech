import java.util.Scanner;

import Interfaces.HumanInterface;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String playerName;
        int playerAge;
        char playerGender;
        // Entering name
        System.out.print("Please enter your name: ");
        Scanner inputName = new Scanner(System.in);
        playerName = inputName.nextLine();
        // Enterting age
        System.out.print("Please enter your age: ");
        Scanner inputAge = new Scanner(System.in);
        playerAge = inputAge.nextInt();
        System.out.println();
        // Create object player
        Human player = new Human(playerName,playerAge);
        player.sayHello();
        System.out.println();
        // Set gender chapter 1
        System.out.print(playerName + " please enter your gender: ");
        Scanner inputGender = new Scanner(System.in);
        playerGender = inputGender.next().charAt(0);
        // Set gender chapter 2
        if (playerGender == 'M') {
            Man playerMan = new Man(playerName, playerAge, playerGender);
            playerMan.sayGender();
        } else if (playerGender == 'F') {
            Woman playerWoman = new Woman(playerName, playerAge, playerGender);
            playerWoman.sayGender();
        } 

        // What I can to do?
        // Interfaces
        HumanInterface playerMan = new Man(playerName, playerAge, playerGender);
        playerMan.myAgeIs();
        playerMan.myNameIs();
    }
}
