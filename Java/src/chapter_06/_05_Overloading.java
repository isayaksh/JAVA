package chapter_06;

public class _05_Overloading {

    public static int getPower(int number){
        return number*number;
    }

    public static int getPower(String number){
        return getPower(Integer.parseInt(number));
    }

    public static int getPower(int number, int exponent){
        return (int) Math.pow(number, exponent);
    }

    public static void main(String[] args) {
        System.out.println(getPower(2));
        System.out.println(getPower("2"));
        System.out.println(getPower(2,3));
    }


}
