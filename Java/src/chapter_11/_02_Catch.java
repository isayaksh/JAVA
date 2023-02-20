package chapter_11;

public class _02_Catch {
    public static void main(String[] args) {

        try {
//            // divide zero error
//            System.out.println(3/0);
//
//            // index error
//            int[] arr = new int[3];
//            arr[5] = 3;
//
//            // cast error
//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toUpperCase());

        } catch (ArithmeticException e){
            System.out.println("0으로 나누면 안되요!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덕스 범위를 넘어섰어요!");
        } catch (ClassCastException e) {
            System.out.println("캐스팅에 실패했어요!");
        } catch (Exception e){
            System.out.println("그 외의 예외입니다.");
        }

        System.out.println("프로그램 정상 종료");
    }
}
