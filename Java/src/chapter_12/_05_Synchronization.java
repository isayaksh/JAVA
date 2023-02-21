package chapter_12;

import chapter_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {

        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i ++) {
                    room.clean("직원[1]");
                }
                System.out.println("직원1 청소 끝!");
            }
        };
        Runnable cleaner2 = () -> {
            for (int i = 0; i < 5; i ++) {
                room.clean("직원{2}");
            }
            System.out.println("직원2 청소 끝!");
        };

        Thread t1 = new Thread(cleaner1);
        Thread t2 = new Thread(cleaner2);
        t1.start();
        t2.start();
    }
}