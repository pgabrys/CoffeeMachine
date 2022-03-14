package machine;
import java.util.Scanner;

public class Commands {


    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    static int waterForEspresso = 250;
    static int coffeeBeansForEspresso = 16;
    static int costOfEspresso = 4;

    static int waterForLatte = 350;
    static int milkForLatte = 75;
    static int coffeeBeansForLatte = 20;
    static int costOfLatte = 7;

    static int waterForCappuccino = 200;
    static int milkForCappuccino = 100;
    static int coffeeBeansForCappuccino = 12;
    static int costOfCappuccino = 6;

    public static void welcome() {
        System.out.println("\n Write action (buy, fill, take, remaining, exit):");
    }


    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int addedWater = scanner.nextInt();
        water += addedWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addedMilk = scanner.nextInt();
        milk += addedMilk;
        System.out.println("Write how many grams of coffee beans you wan to add:");
        int addedCoffeeBeans = scanner.nextInt();
        coffeeBeans += addedCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addedDisposableCups = scanner.nextInt();
        disposableCups += addedDisposableCups;
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
     public static void remaining() {
         System.out.print("The coffee machine has:\n" +
                 water + " ml of water\n" +
                 milk + " ml of milk\n" +
                 coffeeBeans + " g of coffee beans\n" +
                 disposableCups + " disposable cups\n" +
                 "$" + money + " of money\n" +
                 "\n");
     }

     public static void buy() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
         String coffeeOption = scanner.next();
         switch (coffeeOption) {
             case "1":
                 if (water >= waterForEspresso && coffeeBeans >= coffeeBeansForEspresso && disposableCups >= 1) {
                     water -= waterForEspresso;
                     coffeeBeans -= coffeeBeansForEspresso;
                     money += costOfEspresso;
                     disposableCups -= 1;
                     System.out.print("I have enough resources, making you a coffee!\n");
                 } else if (water < waterForEspresso) {
                     System.out.println("Sorry, not enough water!");
                 } else if (coffeeBeans < coffeeBeansForEspresso) {
                     System.out.println("Sorry, not enough coffee beans!");
                 } else if (disposableCups < 1) {
                     System.out.println("Sorry, not enough disposable cups!");
                 }
                 break;
             case "2":
                 if (water >= waterForLatte && coffeeBeans >= coffeeBeansForLatte && milk >= milkForLatte && disposableCups >= 1) {
                     water -= waterForLatte;
                     coffeeBeans -= coffeeBeansForLatte;
                     milk -= milkForLatte;
                     money += costOfLatte;
                     disposableCups -= 1;
                     System.out.print("I have enough resources, making you a coffee!\n");
                 } else if (water < waterForLatte) {
                     System.out.println("Sorry, not enough water!");
                 } else if (coffeeBeans < coffeeBeansForLatte) {
                     System.out.println("Sorry, not enough coffee beans!");
                 } else if (milk < milkForLatte) {
                     System.out.println("Sorry, not enough milk!");
                 } else if (disposableCups < 1) {
                     System.out.println("Sorry, not enough disposable cups!");
                 }
                 break;
             case "3":
                 if (water >= waterForCappuccino && coffeeBeans >= coffeeBeansForCappuccino && milk >= milkForCappuccino && disposableCups >= 1) {
                     water -= waterForCappuccino;
                     coffeeBeans -= coffeeBeansForCappuccino;
                     milk -= milkForCappuccino;
                     money += costOfCappuccino;
                     disposableCups -= 1;
                     System.out.print("I have enough resources, making you a coffee!\n");
                 } else if (water < waterForCappuccino) {
                     System.out.println("Sorry, not enough water!");
                 } else if (coffeeBeans < coffeeBeansForCappuccino) {
                     System.out.println("Sorry, not enough coffee beans!");
                 } else if (milk < milkForCappuccino) {
                     System.out.println("Sorry, not enough milk!");
                 } else if (disposableCups < 1) {
                     System.out.println("Sorry, not enough disposable cups!");
                 }
                 break;
             case "back":
                 break;
         }


     }
}
