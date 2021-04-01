public class plusPlus {
    public static void main(String[] args) {
        int a, b;

        // ++ di belakang
        a = 1;
        b = a++;
        System.out.println("Isi a = " + a + ", b = " + b);

        // ++ di depan
        a = 1;
        b = ++a;
        System.out.println("Isi a = " + a + ", b = " + b);
    }
}
