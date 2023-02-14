package chapter_06;

public class _02_Parameter {

    public static void power(int number){
        System.out.println(number*number);
    }

    public static void powerByExp(int number, int exponent){
        int result = (int) Math.pow(number, exponent);
        System.out.println(number + "의 "+ exponent + "승은 " + result);
    }

    public static void main(String[] args) {
        powerByExp(2,2);
        powerByExp(3,3);
        powerByExp(4,4);
        powerByExp(10,0);
    }
}
