import rental.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kendaraan> daftar = new ArrayList<>();

        // 1. Mobil lama (>5 penumpang)
        daftar.add(new Mobil("B1234AA", "Toyota Innova", 2012, 300000, 7));

        // 2. Mobil baru (<=5)
        daftar.add(new Mobil("B5678BB", "Honda Brio", 2020, 250000, 5));

        // 3. Motor CC besar
        daftar.add(new Motor("B9999CC", "Yamaha R25", 2019, 150000, 250));

        // 4. Motor standar
        daftar.add(new Motor("B8888DD", "Honda Beat", 2021, 100000, 110));

        // POLYMORPHISM
        for (Kendaraan k : daftar) {

            System.out.println("================================");
            k.displayInfo();

            System.out.println(
                "Total Biaya Sewa selama 5 Hari: "
                + k.hitungHargaSewa(5)
            );
        }
    }
}