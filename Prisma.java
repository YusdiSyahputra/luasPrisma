public class Prisma {
    private double panjangAlas;
    private double lebarAlas;
    private double tinggiPrisma;
    
    // Constructor
    public Prisma(double panjangAlas, double lebarAlas, double tinggiPrisma) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggiPrisma = tinggiPrisma;
    }
    
    // Method untuk menghitung luas permukaan prisma
    public double hitungLuasPermukaan() {
        double luasAlas = panjangAlas * lebarAlas;
        double luasPermukaan = 2 * luasAlas + (panjangAlas * tinggiPrisma) + (lebarAlas * tinggiPrisma);
        return luasPermukaan;
    }
    
    // Method setter dan getter (opsional)
    public double getPanjangAlas() {
        return panjangAlas;
    }

    public void setPanjangAlas(double panjangAlas) {
        this.panjangAlas = panjangAlas;
    }

    public double getLebarAlas() {
        return lebarAlas;
    }

    public void setLebarAlas(double lebarAlas) {
        this.lebarAlas = lebarAlas;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
}
