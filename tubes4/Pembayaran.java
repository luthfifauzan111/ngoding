/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
public class Pembayaran {
    private int idPembayaran;
    private double totalBayar;
    private String statusPembayaran;  // Status pembayaran (misalnya "Lunas", "Belum Lunas")
    private Pelanggan pelanggan;  // Referensi ke pelanggan yang melakukan pembayaran

    // Konstruktor
    public Pembayaran(int idPembayaran, double totalBayar, String statusPembayaran, Pelanggan pelanggan) {
        this.idPembayaran = idPembayaran;
        this.totalBayar = totalBayar;
        this.statusPembayaran = statusPembayaran;
        this.pelanggan = pelanggan;
    }

    // Getter dan Setter
    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
}

