package com.savely.scyprospringcalculator;

public interface CalculatorService {
    String createResult(Integer num1, Integer num2, String operator);

    String welcome();

    String plus(Integer num1, Integer num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);
}
