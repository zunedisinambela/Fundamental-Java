import java.util.Scanner;

public class bacaInt {
    public static void main(String[] args) {
        int bil = 0;
        boolean salah;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Masukkan bilangan bulat: ");

            salah = false;
            try {
                bil = scan.nextInt();
            }
            catch (Exception e) {
                System.out.println("Anda salah memasukkan bilangan!");
                salah = true;
                scan.next(); // Buang sisa teks
            }
        } while (salah);

        System.out.println("Bilangan yang anda masukkan: " + bil);
    }
}
