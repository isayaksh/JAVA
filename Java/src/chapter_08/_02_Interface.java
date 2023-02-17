package chapter_08;

import chapter_08.camera.FactoryCam;
import chapter_08.detector.AdvancedFireDetector;
import chapter_08.detector.FireDetector;
import chapter_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();
        normalReporter.report();
        videoReporter.report();

        System.out.println("-----------------------------");

        FireDetector fireDetector = new FireDetector();
        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();
        fireDetector.detect();
        advancedFireDetector.detect();

        System.out.println("-----------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
