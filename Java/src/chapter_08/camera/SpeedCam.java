package chapter_08.camera;

import chapter_08.detector.Detectable;
import chapter_08.reporter.Reportable;

public class SpeedCam extends Camera{

    private Detectable detectable;
    private Reportable reportable;

    public void setDetector(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReporter(Reportable reportable) {
        this.reportable = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect(){
        detectable.detect();
    }

    public void report(){
        reportable.report();
    }
}
