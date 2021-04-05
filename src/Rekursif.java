public class Rekursif {
    public static void main(String[] args) {
        System.out.println("4! = " + faktorial(4));
    }

    public static long faktorial(int n) {
        if (n == 0)
            return (1);
        else
            return (n * faktorial(n-1));
    }
}
