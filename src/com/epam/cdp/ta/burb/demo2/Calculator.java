package com.epam.cdp.ta.burb.demo2;

public class Calculator {

  private int value;

  public Calculator(int value) {
    this.value = value;
  }

  public int sum() {
    int result = 0;
    for (int i = 0; i <= this.value; i++) {
      result += i;
    }
    return result;
  }

  public int fac() {
    int result = 1;
    for (int i = 1; i <= this.value; i++) {
      result *= i;
    }
    return result;
  }

}
