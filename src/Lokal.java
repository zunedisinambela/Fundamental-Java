public class Lokal {
    public static void main(String[] args) {
        String bunga = "Mawar";

        System.out.println("Di metode main() : bunga = " + bunga);

        tesLokal();

        System.out.println("Di metode main() : bunga = " + bunga);
    }

    public static void tesLokal() {
        String bunga = "Melati";

        System.out.println("Di metode tesLokal() : bunga = " + bunga);
    }
}
