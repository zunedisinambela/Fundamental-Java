import java.util.Scanner;

public class Deteksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int harga = 0;
        System.out.print("Harga: ");

        try {
            harga = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Data harga invalid");
            return;
        }

        System.out.println("Harga = " + harga);
    }
}
