public class Bawaan {
    public static void main(String[] args) {
        System.out.println(bentukGaris('=', 20));
        System.out.println(bentukGaris('*'));
        System.out.println(bentukGaris());
    }

    // Argumen
    public static String bentukGaris(char kar, int jumlah) {
        String st = "";

        for (int i = 1; i <= jumlah; i++)
            st += kar;

        return st;
    }

    // Argumen satu
    public static String bentukGaris(char kar) {
        return bentukGaris(kar, 10);
    }

    // Tidak ada argumen
    public static String bentukGaris() {
        return bentukGaris('-', 10);
    }
}
