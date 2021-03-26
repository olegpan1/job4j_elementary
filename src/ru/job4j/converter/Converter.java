package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 35;
    }

    public static void main(String[] args) {
        int inRubles = 140;
        int expectedEuro = 2;
        int expectedDollar = 4;

        int outEuro = Converter.rubleToEuro(inRubles);
        int outDollar = Converter.rubleToDollar(inRubles);

        boolean passedEuro = outEuro == expectedEuro;
        boolean passedDollar = outDollar == expectedDollar;

        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 4 dollars. Test result : " + passedDollar);
    }
}
