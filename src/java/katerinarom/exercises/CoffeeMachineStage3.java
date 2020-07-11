package katerinarom.exercises;

import java.util.Scanner;

final class CoffeeMachineStage3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Starting to make a coffee");
    System.out.println("Grinding coffee beans");
    System.out.println("Boiling water");
    System.out.println("Mixing boiled water with crushed coffee beans");
    System.out.println("Pouring coffee into the cup");
    System.out.println("Pouring some milk into the cup");
    System.out.println("Coffee is ready!");
    System.out.println("Write how many cups of coffee you will need:");
    int water = scanner.nextInt();
    int milk = scanner.nextInt();
    int beans = scanner.nextInt();
    int cup = scanner.nextInt();
    water = water / 200;
    milk = milk / 50;
    beans = beans / 15;
    int min = Math.min(water, Math.min(milk, beans));
    int n = cup - min;

    if (min < cup) {
      System.out.println("No, I can make only " + min + "cup(s) of coffee");
    } else if (min == cup) {
      System.out.println("Yes, I can make that amount of coffee");
    } else {
      System.out.println("Yes, I can make that amount of coffee (and even " + n + " more than that)");
    }
  }
}
