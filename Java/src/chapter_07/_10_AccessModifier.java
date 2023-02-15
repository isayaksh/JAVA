package chapter_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.setModelName("하양이");
        b1.setPrice(-5000);
        b1.setColor("화이트");

        System.out.println(b1.getPrice());
        System.out.println(b1.getResolution());
    }
}
