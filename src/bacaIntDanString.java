import java.util.Scanner;

public class bacaIntDanString {
    public static void main(String[] args) {
        Scanner scanSatu = new Scanner(System.in);
        System.out.print("NIM: ");
        int nim = scanSatu.nextInt();

        Scanner scanDua = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanDua.nextLine();

        System.out.println("Data yang Anda masukkan");
        System.out.println("NIM => " + nim);
        System.out.println("Nama => " + nama);
    }
}
