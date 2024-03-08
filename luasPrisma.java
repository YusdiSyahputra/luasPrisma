import java.util.Scanner;

public class luasPrisma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi segi enam: ");
        double sisi = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        double tinggi = input.nextDouble();

        // Menghitung luas prisma segi enam
        double luasPrisma = hitungLuasPrisma(sisi, tinggi);

        System.out.println("Luas Prisma Segi Enam: " + luasPrisma);
    }

    // Metode untuk menghitung luas prisma segi enam
    public static double hitungLuasPrisma(double sisi, double tinggi) {
        // Rumus luas prisma segi enam: Luas alas * Tinggi
        double luasAlas = 3 * Math.sqrt(3) * Math.pow(sisi, 2) / 2; // Rumus luas segi enam
        double luasPrisma = luasAlas * tinggi;
        return luasPrisma;
    }
}
