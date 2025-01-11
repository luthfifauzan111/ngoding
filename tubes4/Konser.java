/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes4;

/**
 *
 * @author hawaa
 */
public class Konser {
    private String namaKonser;

    // Konstruktor
    public Konser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    // Getter dan Setter
    public String getNamaKonser() {
        return namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    // Override metode toString() untuk menampilkan nama konser
    @Override
    public String toString() {
        return namaKonser;  // Menampilkan nama konser sebagai string
    }
}
