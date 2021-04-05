public class metodeJumlah {
    public static void main(String[] args) {
        int x = 5, y = 12;

        int z = jumlah(x, y);
        System.out.println("z = " + z);

        System.out.println("Jumlah (2, 18) = " + jumlah(2, 18));
        System.out.println("Jumlah (x, 18) = " + jumlah(x, 18));
    }

    public static int jumlah(int a, int b) {
        return (a+b);
    }
}
