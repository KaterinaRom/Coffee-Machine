package katerinarom.exercises;

import java.util.Scanner;

final class CoffeeMachineStage5 {
  static Scanner scanner = new Scanner(System.in);
  static int waterAmount = 400;
  static int moneyAmount = 550;
  static int milkAmount = 540;
  static int coffeeAmount = 120;
  static int cupAmount = 9;

  public static void machineContent() {
    System.out.println("The coffee machine has:");
    System.out.println(waterAmount + " of water");
    System.out.println(milkAmount + " of milk");
    System.out.println(coffeeAmount + " of coffee beans");
    System.out.println(cupAmount + " of disposable cups");
    System.out.println("$" + moneyAmount + " of money");
  }

  public static void deductAmount(int deduct, String productType) {
    switch(productType) {
      case "water":
        waterAmount -= deduct;
        break;

      case "money":
        moneyAmount -= deduct;
        break;

      case "milk":
        milkAmount -= deduct;
        break;

      case "coffee":
        coffeeAmount -= deduct;
        break;

      case "cup":
        cupAmount -= deduct;
        break;
    }
  }

  public static void addAmount(int add, String productType) {
    switch(productType) {
      case "water":
        waterAmount += add;
        break;

      case "money":
        moneyAmount += add;
        break;

      case "milk":
        milkAmount += add;
        break;

      case "coffee":
        coffeeAmount += add;
        break;

      case "cup":
        cupAmount += add;
        break;
    }
  }

  public static void mainMenu() {

    System.out.println("Write action (buy, fill, take, remaining, exit):");
    String action = scanner.next();

    if (action.equals("buy")) {
      //action for buy

      System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

      String whatToBuy = scanner.next();

      switch (whatToBuy) {
        case "1":

          if (waterAmount < 250) {
            System.out.println("Sorry, not enough water!");
            break;
          } else if (coffeeAmount < 16) {
            System.out.println("Sorry, not enough coffee beans!");
            break;
          } else {
            System.out.println("I have enough resources, making you a coffee!");
          }

          deductAmount(250, "water");
          deductAmount(16, "coffee");
          addAmount(4, "money");
          deductAmount(1, "cup");
          break;

        case "2":
          if (waterAmount < 350) {
            System.out.println("Sorry, not enough water!");
            break;
          } else if (coffeeAmount < 20) {
            System.out.println("Sorry, not enough coffee beans!");
            break;
          } else if (milkAmount < 75) {
            System.out.println("Sorry, not enough milk!");
            break;
          }
          else {
            System.out.println("I have enough resources, making you a coffee!");
          }
          deductAmount(350, "water");
          deductAmount(75,"milk");
          deductAmount(20, "coffee");
          addAmount(7,"money");
          deductAmount(1, "cup");
          break;

        case "3":
          if (waterAmount < 200) {
            System.out.println("Sorry, not enough water!");
            break;
          } else if (coffeeAmount < 12) {
            System.out.println("Sorry, not enough coffee beans!");
            break;
          } else if (milkAmount < 100) {
            System.out.println("Sorry, not enough milk!");
            break;
          }
          else {
            System.out.println("I have enough resources, making you a coffee!");
          }
          deductAmount(200, "water");
          deductAmount(100,"milk");
          deductAmount(12, "coffee");
          addAmount(6, "money");
          deductAmount(1, "cup");
          break;

        case "back":
          mainMenu();
          break;
      }
    } else if (action.equals("fill")) {

      //action for fill

      System.out.print("Write how many ml of water do you want to add:");
      int waterToAdd = scanner.nextInt();
      addAmount(waterToAdd,"water");

      System.out.print("Write how many ml of milk do you want to add:");
      int milkToAdd = scanner.nextInt();
      addAmount(milkToAdd,"milk");

      System.out.print("Write how many grams of coffee beans do you want to add:");
      int coffeeToAdd = scanner.nextInt();
      addAmount(coffeeToAdd,"coffee");

      System.out.println("Write how many disposable cups of coffee do you want to add:");
      int cupsToAdd = scanner.nextInt();
      addAmount(cupsToAdd,"cup");


    } else if (action.equals("take")) {

      //action for take

      System.out.println("I gave you $" + moneyAmount);
      deductAmount(moneyAmount,"money");

    } else if (action.equals("remaining")) {
      machineContent();
    } else if (action.equals("exit")) {
      System.exit(0);
    }

    mainMenu();
  }

  public static void main(String[] args) {

    mainMenu();

  }
}
