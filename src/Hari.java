import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        System.out.println("1 = Senin 2 = Selasa 3 = Rabu 4 = Kamis");
        System.out.println("5 = Jumat 6 = Sabtu 7 = Minggu");
        System.out.print("Masukkan kode hari (1-7): ");

        Scanner scan = new Scanner(System.in);
        int kode = scan.nextInt();

        switch (kode) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hari kerja");
                break;
            case 6:
            case 7:
                System.out.println("Hari libur");
                break;
            default:
                System.out.println("Kode hari tidak valid");
        }
    }
}
