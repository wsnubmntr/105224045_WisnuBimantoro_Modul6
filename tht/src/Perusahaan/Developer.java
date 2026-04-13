package Perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    // Constructor
    public Developer(String id, String nama, int tahunMasuk, double gajiPokok, double rating,
                     String level, int jumlahBugFix) {
        super(id, nama, tahunMasuk, gajiPokok, rating);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    @Override
    public double hitungGajiTotal() {
        double total = super.hitungGajiTotal();

        // Tunjangan level
        if (level.equalsIgnoreCase("Mid")) {
            total += 1500000;
        } else if (level.equalsIgnoreCase("Senior")) {
            total += 3000000;
        }

        // Bonus bug (cuma jika rating >= 3.0)
        if (getRatingKinerja() >= 3.0) {
            total += jumlahBugFix * 50000;
        }

        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}
