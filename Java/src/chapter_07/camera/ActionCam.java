package chapter_07.camera;

public class ActionCam extends Camera {

    public final String lens = "광각 렌즈";

    public ActionCam() {
        super("액션 카메라");
    }

    public final void makeVideo(){
        System.out.println(getName() + " : " + lens + "로 제작한 멋진 비디오를 제작합니다.");
    }

}
