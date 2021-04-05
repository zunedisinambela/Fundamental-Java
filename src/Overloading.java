public class Overloading {
    public static void main(String[] args) {
        System.out.println(jumlah(2, 3));
        System.out.println(jumlah(2.2, 3.3));
    }

    public static double jumlah(double a, double b) {
        return (a + b);
    }

    public static int jumlah(int a, int b) {
        return (a + b);
    }
}
