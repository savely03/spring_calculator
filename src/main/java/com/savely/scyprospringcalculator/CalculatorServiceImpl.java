package com.savely.scyprospringcalculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String createResult(Integer num1, Integer num2, String operator) {
        if (num1 != null && num2 != null) {
            String s = "<h2>%d %s %d = %d</h2>";
            switch (operator) {
                case "+":
                    return String.format(s, num1, "+", num2, num1 + num2);
                case "-":
                    return String.format(s, num1, "-", num2, num1 - num2);
                case "/":
                    if (num2 == 0) {
                        return "<h2>Ошибка деления на 0!</h2>";
                    }
                    return String.format(s, num1, "/", num2, num1 / num2);
                case "*":
                    return String.format(s, num1, "*", num2, num1 * num2);
            }
        }
        return "<h2>Ошибка! Проверьте корректность введенных данных!</h2>";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        return createResult(num1, num2, "+");
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return createResult(num1, num2, "-");
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return createResult(num1, num2, "*");
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        return createResult(num1, num2, "/");
    }

    @Override
    public String welcome() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }
}
