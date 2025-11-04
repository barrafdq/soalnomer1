import java.util.Scanner;

public class ongkir {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        final double PI = 3.14159; // Nilai pi
        return PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari dan tinggi dari pengguna
        System.out.print("Masukkan jari-jari alas tabung (cm): ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();

        // Panggil fungsi untuk menghitung volume
        double volume = hitungVolume(jariJari, tinggi);

        // Output hasil
        System.out.println("Volume tabung adalah: " + volume + " cm³");

        scanner.close();
    }
}