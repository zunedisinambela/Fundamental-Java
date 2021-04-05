public class Suhu {
    public static void main(String[] args) {
        System.out.printf("%8s %8s\n", "Celcius", "Fahrenheit");

        for ( int celcius = 0; celcius <= 100; celcius += 10) {
            double fahrenheit = 9.0 / 5 * celcius + 32;
            System.out.printf("%8.2f %10.2f\n", (double) celcius, fahrenheit);
        }
    }
}
