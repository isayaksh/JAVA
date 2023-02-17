package chapter_08;

import chapter_08.camera.Camera;
import chapter_08.camera.FactoryCam;
import chapter_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstract)

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
