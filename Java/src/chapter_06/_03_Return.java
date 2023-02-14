package chapter_06;

public class _03_Return {

    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "수원시 어딘가";
    }

    public static String getActivity(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.println("phoneNumber = " + phoneNumber);
        String address = getAddress();
        System.out.println("address = " + address);
        System.out.println("activity = " + getActivity());
    }

}
