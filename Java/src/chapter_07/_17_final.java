package chapter_07;

import chapter_07.camera.ActionCam;
import chapter_07.camera.SlowActionCam;

public class _17_final {
    public static void main(String[] args) {
        // Final

        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();


    }
}
