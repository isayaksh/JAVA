package chapter_06;

public class _06_WhenToUse {

    public static int getPower(int number){
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent){
        return (int) Math.pow(number, exponent);
    }

    public static void main(String[] args) {

        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(4,2));

    }
}
