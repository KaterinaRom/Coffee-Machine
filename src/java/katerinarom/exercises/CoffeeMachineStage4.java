package katerinarom.exercises;

import java.util.Scanner;

final class CoffeeMachineStage4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;
    System.out.println("The coffee machine has:");
    System.out.println(water + " of water");
    System.out.println(milk + " of milk");
    System.out.println(coffeeBeans + " of coffee beans");
    System.out.println(cups + " of disposable cups");
    System.out.println(money + " of money");
    System.out.println();
    System.out.println("Write action (buy, fill, take):");
    String action = scanner.next();
    switch (action) {
      case "buy":
      case "fill":
      case "take": {
        break;
      }
      default: {
        throw new RuntimeException("Kate logging '" + action + "'");
      }
    }
    if (action.equals("buy")) {
      System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
      int latte = scanner.nextInt();
      switch (latte) {
        case 1:
          int afterWater = water - 250;
          int afterCoffee = coffeeBeans - 16;
          int afterMoney = money + 4;
          int afterCups = cups - 1;
          System.out.println("The coffee machine has:");
          System.out.println(afterWater + " of water");
          System.out.println(milk + " of milk");
          System.out.println(afterCoffee + " of coffee beans");
          System.out.println(afterCups + " of disposable cups");
          System.out.println(afterMoney + " of money");
          break;
        case 2:
          int afterWater2 = water - 350;
          int afterCoffee2 = coffeeBeans - 20;
          int afterMoney2 = money + 7;
          int afterCups2 = cups - 1;
          int afterMilk2 = milk - 75;
          System.out.println("The coffee machine has:");
          System.out.println(afterWater2 + " of water");
          System.out.println(afterMilk2 + " of milk");
          System.out.println(afterCoffee2 + " of coffee beans");
          System.out.println(afterCups2 + " of disposable cups");
          System.out.println(afterMoney2 + " of money");
          break;
        case 3:
          int afterWater3 = water - 200;
          int afterCoffee3 = coffeeBeans - 12;
          int afterMoney3 = money + 6;
          int afterCups3 = cups - 1;
          int afterMilk3 = milk - 100;
          System.out.println("The coffee machine has:");
          System.out.println(afterWater3 + " of water");
          System.out.println(afterMilk3 + " of milk");
          System.out.println(afterCoffee3 + " of coffee beans");
          System.out.println(afterCups3 + " of disposable cups");
          System.out.println(afterMoney3 + " of money");
          break;
      }
    }
    if (action.equals("fill")) {
      System.out.println("Write how much ml of water do you want to add:");
      int add = scanner.nextInt();
      int full = water + add;
      System.out.println("Write how much ml of milk do you want to add:");
      int add2 = scanner.nextInt();
      int full2 = milk + add2;
      System.out.println("Write how many grams of coffee beans do you want to add:");
      int add3 = scanner.nextInt();
      int full3 = coffeeBeans + add3;
      System.out.println("Write how many disposable cups of coffee do you want to add:");
      int add4 = scanner.nextInt();
      int full4 = cups + add4;
      System.out.println("The coffee machine has:");
      System.out.println(full + " of water");
      System.out.println(full2 + " of milk");
      System.out.println(full3 + " of coffee beans");
      System.out.println(full4 + " of disposable cups");
      System.out.println(money + " of money");
    }
    if (action.equals("take")) {

      System.out.println("I gave you $ " + money);
      System.out.println();
      int z = money - 550;
      System.out.println("The coffee machine has:");
      System.out.println(water + " of water");
      System.out.println(milk + " of milk");
      System.out.println(coffeeBeans + " of coffee beans");
      System.out.println(cups + " of disposable cups");
      System.out.println(z + " of money");
    }
  }
}

