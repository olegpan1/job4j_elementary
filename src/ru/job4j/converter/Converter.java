package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inRubles = 140;
        float expectedEuro = 2;
        float expectedDollar = 4;
        float outEuro = Converter.rubleToEuro(inRubles);
        float outDollar = Converter.rubleToDollar(inRubles);
        boolean passedEuro = outEuro == expectedEuro;
        boolean passedDollar = outDollar == expectedDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 4 dollars. Test result : " + passedDollar);
    }
}
