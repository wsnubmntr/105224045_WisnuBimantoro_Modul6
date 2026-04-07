package minimarket;

public class Produk {

    // atribut
    protected String namaProduk;
    protected double harga;

    // constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // method tampilin detail
    public void tampilkanDetail() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
    }
}