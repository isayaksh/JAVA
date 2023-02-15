package chapter_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.setModelName("하양이");
        b1.setPrice(-5000);
        b1.setColor("화이트");

        System.out.println(b1.getPrice());
        System.out.println(b1.getResolution());

    }
}
