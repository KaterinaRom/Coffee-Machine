package katerinarom.exercises;

import java.util.Scanner;

final class CoffeeMachineStage2 {
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
    int value = scanner.nextInt();
    System.out.println("For" + value + "cups of coffee you will need:");
    int value1 = 200 * value;
    int value2 = 50 * value;
    int value3 = 15 * value;
    System.out.println(value1 + "ml of water");
    System.out.println(value2 + "ml of milk");
    System.out.println(value3 + "ml of coffee beans");
  }
}