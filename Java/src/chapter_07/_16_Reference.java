package chapter_07;

import chapter_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {

        // 기본 자료형(Primitive Data Types)
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형(Non-Primitive Data Types)
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

    }
}
