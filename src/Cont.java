public class Cont {
    public static void main(String[] args) {
        int bil = 7;
        while ( bil <= 30 ) {
            System.out.println(bil);

            if ( bil == 10) {
                bil += 15;
                continue;
            }
            bil++;
        }
    }
}
