/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
 abstract class PemesananTiket {
    private int idPemesanan;
    private double totalHarga;
    private Pelanggan pelanggan;
    private String jenisTiket;
    private int jumlahTiket;
    private Konser konser;  // Menambahkan atribut konser

    // Konstruktor
    public PemesananTiket(int idPemesanan, double totalHarga, Pelanggan pelanggan, String jenisTiket, int jumlahTiket, Konser konser) {
        this.idPemesanan = idPemesanan;
        this.totalHarga = totalHarga;
        this.pelanggan = pelanggan;
        this.jenisTiket = jenisTiket;
        this.jumlahTiket = jumlahTiket;
        this.konser = konser;  // Inisialisasi konser
    }

    // Metode untuk menghitung harga
    public double hitungHarga() {
        return totalHarga * jumlahTiket;
    }

    // Getter dan Setter
    public int getIdPemesanan() {
        return idPemesanan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public Konser getKonser() {
        return konser;
    }

    public void setKonser(Konser konser) {
        this.konser = konser;
    }
}
