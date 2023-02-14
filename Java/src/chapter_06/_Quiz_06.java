package chapter_06;

public class _Quiz_06 {
    public static void main(String[] args) {

        Certificate privateCertificate = Certificate.makePrivate("김상현", "971119-1234567", "010-1234-5678");
        System.out.println(privateCertificate);
    }
}

class Certificate {
    private String name;
    private String registrationNumber;
    private String phoneNumber;

    public static Certificate makePrivate(String name, String registrationNumber, String phoneNumber){
        Certificate certificate = new Certificate();
        certificate.name = name.substring(0,1) + "*".repeat(name.length() - 1) ;
        certificate.registrationNumber = registrationNumber.substring(0, registrationNumber.indexOf("-") + 2) + "*".repeat(6);
        certificate.phoneNumber = phoneNumber.substring(0, phoneNumber.lastIndexOf("-")+1) + "*".repeat(4);
        return certificate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
