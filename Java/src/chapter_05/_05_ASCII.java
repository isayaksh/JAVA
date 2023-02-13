package chapter_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드

        char c = 'A';
        System.out.println(c + " : " + (int) c);

        c = 'B';
        System.out.println(c + " : " + (int) c);

        c++;
        System.out.println(c + " : " + (int) c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[0].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j+1);
            }
            ch++;
        }

        for (String[] seat : seats3) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
