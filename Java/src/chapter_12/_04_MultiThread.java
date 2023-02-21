package chapter_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("직원1 " + i +"번방 청소 중...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("직원1 청소 끝!");
            }
        };
        Runnable cleaner2 = () -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("직원2 " + i +"번방 청소 중...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("직원2 청소 끝!");
        };

        Thread t1 = new Thread(cleaner1);
        Thread t2 = new Thread(cleaner2);
        t1.start();
        t2.start();

    }
}
