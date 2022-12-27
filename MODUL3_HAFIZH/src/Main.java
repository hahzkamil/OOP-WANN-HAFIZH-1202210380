import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean repeat = true;

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square (persegi)");
        System.out.println("2. Circle (lingkaran)");
        System.out.println("3. Trapezoid (trapesium)");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int choice = scanner.nextInt();

        switch (choice) {
          case 1:
            System.out.print("Input side length of square: ");
            double side = scanner.nextDouble();
            Calculation square = new Calculation();
            square.setSquare(side);
            square.run();
            System.out.println("Area of square: " + square.getSquare());
            break;
          case 2:
            System.out.print("Input radius of circle: ");
            double radius = scanner.nextDouble();
            Calculation circle = new Calculation();
            circle.setCircle(radius);
            circle.run();
            System.out.println("Area of circle: " + circle.getCircle());
            break;
          case 3:
            System.out.print("Input the side of the base of trapezoid: ");
            double a = scanner.nextDouble();
            System.out.print("Input the upper side of trapezoid: ");
            double b = scanner.nextDouble();
            System.out.print("Input height of trapezoid: ");
            double t = scanner.nextDouble();
            Calculation trapezoid = new Calculation();
            trapezoid.setTrapezoid(a, b, t);
            trapezoid.run();
            System.out.println("Area of trapezoid: " + trapezoid.getTrapezoid());
            break;
          case 0:
            System.out.println("Program finished");
            repeat = false;
            break;
          default:
            System.out.println("Option not available");
            continue;
        }
      } catch (InputMismatchException e) {
        System.out.println("Error: Input must be a number");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}
