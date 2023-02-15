package chapter_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0;

    static boolean canAutoReport = false;

    public BlackBox(String modelName, String resolution, int price, String color) {
//        this();
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    public BlackBox() {
        this.serialNumber = ++counter;
    }

    public void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    public void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    public int getVideoFileCount(int type){
        if(type == 1){
            return 9;
        } else if (type == 2){
            return 1;
        }
        return 10;
    }

    public void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime){
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    public void record(){
        record(true, true, 5);
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
        // modelName = "";
        canAutoReport = true;
    }

    public void appendModelName(String name) {
        this.modelName += name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
