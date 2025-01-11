/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
import java.util.ArrayList;

public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private String email;
    private String notelp;
    private ArrayList<PemesananTiket> daftarTiket = new ArrayList<>(); // Daftar tiket yang dimiliki pelanggan

    public Pelanggan(int idPelanggan, String nama, String email, String notelp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.notelp = notelp;
    }

    public void tambahTiket(PemesananTiket tiket) {
        daftarTiket.add(tiket);
    }

    public ArrayList<PemesananTiket> getDaftarTiket() {
        return daftarTiket;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setDaftarTiket(ArrayList<PemesananTiket> daftarTiket) {
        this.daftarTiket = daftarTiket;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNotelp() {
        return notelp;
    }
}

