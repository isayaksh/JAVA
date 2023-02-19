package chapter_10;

import chapter_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {

        convertUSD((USD) -> System.out.println(USD + "달러는 " + USD * 1400 + "원입니다."), 2);
        System.out.println("=================================");

        Convertible convertible = (USD) -> System.out.println(USD + "달러는 " + USD * 1400 + "원입니다.");
        convertUSD(convertible, 3);
        System.out.println("=================================");

        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 1400원 입니다.");
        c1.convert();
        System.out.println("=================================");

        ConvertibleWithNoParams c2 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러는 " + USD * 1400 + "원입니다.");
        };
        c2.convert();
        System.out.println("=================================");

        ConvertibleWithParams c3 = (USD, KRW) -> System.out.println(USD + "달러는 " + USD * 1400 + "원입니다.");
        c3.convert(10,1400);
        System.out.println("=================================");

        ConvertibleWithReturn c4 = (USD, KRW) -> USD * KRW;
        int convert = c4.convert(20, 1400);
        System.out.println("convert = " + convert);

    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
