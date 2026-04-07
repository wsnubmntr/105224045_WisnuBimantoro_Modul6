import minimarket.MakananRingan;
public class Main {
    public static void main(String[] args) {

        // buat objek
        MakananRingan snack = new MakananRingan(
                "Keripik Kentang",
                12000,
                "Balado"
        );

        // tampilin detail
        snack.tampilkanDetail();
    }
}