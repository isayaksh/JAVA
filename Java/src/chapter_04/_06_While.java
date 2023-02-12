package chapter_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25;
        int move = 0;
        while (move < distance){
            System.out.println("move = " + move);
            move += 3;
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
        /*move = 0;
        while (move < distance){
            System.out.println("move = " + move);
        }*/


    }
}
