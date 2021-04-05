public class argTakada {
    public static void main(String[] args) {
        System.out.println(garis());
        System.out.println("Tes...tes...123. Yak!");
        System.out.println(garis());
    }

    public static String garis() {
        String st = "";
        for ( int i = 1; i <= 25; i++)
            st += "-";

        return (st);
    }
}
