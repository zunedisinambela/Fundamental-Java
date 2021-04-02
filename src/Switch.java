import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah bilangan bulat (1-3): ");
        Scanner scan = new Scanner(System.in);
        int bilangan = scan.nextInt();

        switch (bilangan) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Saya hanya kenal 1, 2, 3 saja");
        }
    }
}
