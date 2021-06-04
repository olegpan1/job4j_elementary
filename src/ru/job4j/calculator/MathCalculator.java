package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double allOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + divide(first, second)
                + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("Результат diffAndDivide: " + diffAndDivide(10, 20));
        System.out.println("Результат allOperation: " + allOperation(10, 20));
    }
}