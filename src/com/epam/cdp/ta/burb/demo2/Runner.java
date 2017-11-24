package com.epam.cdp.ta.burb.demo2;

import java.util.Scanner;

import static java.lang.System.*;

public class Runner {
  public static void main(String[] args) {
    boolean isRepeat = true;


    while (isRepeat) {
      out.println("Please, enter number of menu:");
      out.println("1 - Summ");
      out.println("2 - Factorial");
      out.println("0 - Exit");
      Scanner scanner = new Scanner(in);
      int action = scanner.nextInt();
      int toValueSumm;
      switch (action) {
      case 0:
        isRepeat = false;
        out.println("Completed");
        break;
      case 1:
        out.println("Please, enter N: ");
        toValueSumm = scanner.nextInt();
        Calculator calc1 = new Calculator(toValueSumm);
        out.println("Sum = " + calc1.sum());
        break;
      case 2:
        out.println("Please, enter N: ");
        toValueSumm = scanner.nextInt();
        Calculator calc2 = new Calculator(toValueSumm);
        out.println("Factorial = " + calc2.fac());
        break;
      default:
        out.println("Incorrect value! Please, try again.");
        break;
      }
    }
  }
}
