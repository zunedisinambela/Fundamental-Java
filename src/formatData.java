public class formatData {
    public static void main(String[] args) {
        String barang = "Keripik Apel";
        int harga = 12550;

        System.out.printf("Harga %20s = %8d%n", barang, harga);
        System.out.printf("Harga %20S = %8d%n", barang, harga);
        System.out.printf("Harga %-20s = %8d%n", barang, harga);
        System.out.printf("Harga %s = %8d%n", barang, harga);
        System.out.printf("Harga %20s = %+8d%n", barang, harga);
        System.out.printf("Harga %20s = %8.2f%n", barang, (float) harga);
    }
}
