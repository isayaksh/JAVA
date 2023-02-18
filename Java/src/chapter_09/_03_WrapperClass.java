package chapter_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스
        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i + ", " + d + ", " + c);
        System.out.println("=====================");
        System.out.println(i.intValue() + ", " + d.intValue() + ", " + c.charValue());
        System.out.println("=====================");
        String s = i.toString();
        System.out.println(s);
    }
}
