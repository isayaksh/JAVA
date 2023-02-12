package chapter_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 do while
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance){
            System.out.println("move = " + move);
            move += 3;
        }
        System.out.println("반복문 #1");

        move = 0;
        height = 25;
        while (move + height < distance){
            System.out.println("move = " + move);
            move += 3;
        }
        System.out.println("반복문 #2");

        do {
            System.out.println("move = " + move);
            move += 3;
        } while (move+height < distance);
        System.out.println("반복문 #3");
    }
}
