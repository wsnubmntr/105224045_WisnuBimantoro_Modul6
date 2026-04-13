import Perusahaan.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList tipe Karyawan (polimorfisme)
        ArrayList<Karyawan> daftar = new ArrayList<>();

        // Data
        daftar.add(new Karyawan("K1", "Andi", 2020, 5000000, 2.0));
        daftar.add(new Developer("D1", "Budi", 2018, 7000000, 4.0, "Senior", 20));
        daftar.add(new Developer("D2", "Citra", 2024, 6000000, 2.8, "Mid", 15));
        daftar.add(new Manajer("M1", "Dewi", 2015, 10000000, 4.8, "IT", 10));
        daftar.add(new Manajer("M2", "Eko", 2025, 9000000, 3.5, "HR", 3));

        double totalGaji = 0;
        double totalRating = 0;

        double gajiTertinggi = 0;
        String namaTertinggi = "";

        // Loop semua data
        for (Karyawan k : daftar) {
            k.displayInfo();

            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini: Rp " + gaji);
            System.out.println("------------------------");

            totalGaji += gaji;
            totalRating += k.getRatingKinerja();

            // Cari gaji tertinggi
            if (gaji > gajiTertinggi) {
                gajiTertinggi = gaji;
                namaTertinggi = k.getNama();
            }
        }

        // Output tambahan
        System.out.println("Total Anggaran Gaji: Rp " + totalGaji);
        System.out.println("Highest Earner: " + namaTertinggi);
        System.out.println("Rata-rata Rating: " + (totalRating / daftar.size()));
    }
}