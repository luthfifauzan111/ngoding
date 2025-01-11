/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
public class TiketReguler extends PemesananTiket {

    private Konser konser;

    public TiketReguler(int idPemesanan, double totalHarga, String fasilitas, Pelanggan pelanggan, String jenisTiket, int jumlahTiket, Konser konser) {
        super(idPemesanan, totalHarga, pelanggan, jenisTiket, jumlahTiket, konser);  // Konstruktor superclass
    }
    
    public void tampilkanInfoKonser() {
        if (getKonser() != null) {
            System.out.println("Konser: " + getKonser().getNamaKonser());
        } else {
            System.out.println("Konser belum dipilih.");
        }
    }

    @Override
    public double hitungHarga() {
        return getJumlahTiket() * 50000;  // Harga tiket Reguler adalah 50000 per tiket
    }
}

