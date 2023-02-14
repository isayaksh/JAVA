package chapter_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number){
        return number*number;
    }
    public static int getPowerByExp(int number, int exponent){
        return (int) Math.pow(number, exponent);
    }


    public static void main(String[] args) {
        int power1 = getPower(2);
        int power2 = getPower(3);
        int power3 = getPower(4);
        System.out.println("power1 = " + power1);
        System.out.println("power2 = " + power2);
        System.out.println("power3 = " + power3);
        int powerByExp1 = getPowerByExp(2, 3);
        int powerByExp2 = getPowerByExp(2, 4);
        int powerByExp3 = getPowerByExp(2, 5);
        System.out.println("powerByExp1 = " + powerByExp1);
        System.out.println("powerByExp2 = " + powerByExp2);
        System.out.println("powerByExp3 = " + powerByExp3);
    }
}
