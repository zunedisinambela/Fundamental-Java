public class Lintasan {
    public static void main(String[] args) {
        double sudut = 40;
        double kecepatan = 32;

        double radian = sudut * 3.14 /180;
        double jarak = 2 * kecepatan * kecepatan * Math.sin(radian) * Math.cos(radian) / 9.8;
        System.out.println("Jarak = " + jarak);
    }
}
