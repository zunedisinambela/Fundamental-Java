import java.util.Scanner;

public class jenisHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah karakter: ");

        char kar = scan.nextLine().charAt(0);

        if ((kar >= 'A') && (kar <= 'Z') || (kar >= 'a') && (kar <= 'z'))
            System.out.println(kar + " adalah huruf ");
        else
            if ((kar >= '0') && (kar <= '9'))
                System.out.println(kar + " adalah digit");
            else
                System.out.println(kar + " bukan huruf/digit");
    }
}
