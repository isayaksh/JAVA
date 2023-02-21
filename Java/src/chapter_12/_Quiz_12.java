package chapter_12;

public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println(" -- A 상품 준비 완료 -- ");
        };

        Runnable r2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 -- ");
        };

        Runnable r3 = () -> {
            System.out.println(" == 세트 상품 포장 시작 == ");
            for (int i = 0; i < 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println(" == 세트 상품 포장 완료 == ");
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }
}
