package chapter_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();
        b1.insertMemoryCard(128);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("fileCount = " + fileCount);

        fileCount = b1.getVideoFileCount(2);
        System.out.println("fileCount = " + fileCount);

        fileCount = b1.getVideoFileCount(3);
        System.out.println("fileCount = " + fileCount);


    }
}
