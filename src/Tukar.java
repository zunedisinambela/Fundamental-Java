public class Tukar {
    public static void main(String[] args) {
        int a = 12;
        int b = 33;

        System.out.println("Di fungsi main() : a = " + a + ", b = " + b);

        tukarkan(a, b);

        System.out.println("Di fungsi main() : a = " + a + ", b = " + b);
    }

    public static void tukarkan(int a, int b) {
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Di fungsi tukarkan() : a = " + a + ", b = " + b);
    }
}
