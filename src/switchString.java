import java.util.Scanner;

public class switchString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Apa yang Anda pesan: ");

        String pesanan = scan.nextLine();

        switch (pesanan) {
            case "soto":
                System.out.println("Soto kudus siap dihidangkan");
                break;
            case "bakso":
                System.out.println("Silakan menikmati bakso nikzat");
                break;
            case "rendang":
                System.out.println("Rendangnya bikin lidah bergoyang-goyang");
                break;
            default:
                System.out.println("Maaf, pilihan soto, bakso, atau rendang");
        }
    }
}
