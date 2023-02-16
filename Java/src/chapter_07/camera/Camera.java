package chapter_07.camera;

public class Camera {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Camera() {
        this("카메라");
    }

    protected Camera(String name){
        this.name = name;
    }

    public void takePicture(){
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
