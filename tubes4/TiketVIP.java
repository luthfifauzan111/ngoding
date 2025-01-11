/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
public class TiketVIP extends PemesananTiket {

   private Konser konser;
    public TiketVIP(int idPemesanan, double totalHarga, String fasilitas, Pelanggan pelanggan, String jenisTiket, int jumlahTiket,Konser konser) {
        super(idPemesanan, totalHarga, pelanggan, jenisTiket, jumlahTiket,konser);
        this.konser = konser;// Konstruktor superclass
       
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
        return getJumlahTiket() * 100000;  // Harga tiket VIP adalah 100000 per tiket
    }


}

