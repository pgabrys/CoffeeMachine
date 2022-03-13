package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        boolean exit = false;


        do {
            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            System.out.println("");
        switch (option) {
            case "buy":
                Commands.buy();
                break;
            case "fill":
                Commands.fill();
               break;
            case "take":
                Commands.take();
                break;
            case "remaining":
                Commands.remaining();
                break;
            case "exit":
                exit = true;
                break;
            default:
                System.out.println("Unsuitable action, please, try again");
        }
        } while (!exit);

    }
}
