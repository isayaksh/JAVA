package chapter_07.camera;

public class FactoryCam extends Camera{

    public FactoryCam() {
        super("공장 카메라");
    }

    @Override
    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }

    public void detectFire(){
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature(){
        System.out.println(getName() + "의 주요 기능 : 화재 감지");
    }


}
