public class varInstan {
    static String bunga;

    public static void main(String[] args) {
        bunga = "Mawar";

        System.out.println("Di fungsi main() : bunga = " + bunga);

        tesGlobal();

        System.out.println("Di fungsi main() : bunga = " + bunga);
    }

    public static void tesGlobal() {
        bunga = "Melati";

        System.out.println("Di fungsi testGlobal() : bunga = " + bunga);
    }
}
