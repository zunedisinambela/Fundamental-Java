import java.util.Scanner;

public class Kapital {
    public static void main(String[] args) {
        char kar;

        System.out.print("Masukkan sebuah karakter: ");
        Scanner scan = new Scanner(System.in);
        kar = scan.nextLine().charAt(0);

        if ((kar >= 'A') && (kar <= 'Z'))
            System.out.println(kar + " adalah huruf kapital");
        else
            System.out.println(kar + " bukan huruf kapital");
    }
}
