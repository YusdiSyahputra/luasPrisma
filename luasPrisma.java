import java.util.Scanner;

public class luasPrisma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sisi = 7.5;
        double tinggi = 2.3;

        System.out.println("Sisi = " + sisi);
        System.out.println("Tinggi = " + tinggi);


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
