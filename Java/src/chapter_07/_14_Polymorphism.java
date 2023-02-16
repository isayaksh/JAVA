package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        Camera[] cameras = {camera, factoryCam, speedCam};
        for (Camera camera1 : cameras) {
            camera1.showMainFeature();
        }

        if(camera instanceof Camera){
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam){
            FactoryCam factoryCam1 = (FactoryCam) factoryCam;
            factoryCam1.detectFire();
        }

        if (speedCam instanceof SpeedCam){
            SpeedCam speedCam1 = (SpeedCam) speedCam;
            speedCam1.checkSpeed();
        }
    }
}
