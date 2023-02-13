package chapter_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        // 다차원 배열 순회

        // 3 * 5 크기의 2차원 배열
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (String[] seat : seats) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (String[] seat : seats2) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        for (String[] seat : seats3) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
