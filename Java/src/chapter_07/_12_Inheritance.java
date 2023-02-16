package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        SpeedCam speedCam = new SpeedCam();
        FactoryCam factoryCam = new FactoryCam();

        System.out.println("camera.name = " + camera.getName());
        System.out.println("speedCam.name = " + speedCam.getName());
        System.out.println("factoryCam.name = " + factoryCam.getName());

        camera.takePicture();
        speedCam.takePicture();
        factoryCam.recordVideo();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }
}
