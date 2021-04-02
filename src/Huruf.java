import java.util.Scanner;

public class Huruf {
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah karakter: ");
        Scanner scan = new Scanner(System.in);
        char kar = scan.nextLine().charAt(0);

        if ((kar >= 'A') && (kar <= 'Z') || (kar >= 'a') && (kar <= 'z'))
            System.out.println(kar + " adalah huruf ");
        else
            System.out.println(kar + " bukan huruf ");
    }
}
