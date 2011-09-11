/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author puspa
 */
public class Pengguna implements Peminjam{
    private String nama;
    private String alamat;
    
    /**
     * Konstruktor
     */
    public Pengguna() {
    }

    /**
     * Konstruktor
     * @param nama
     * @param alamat
     */
    public Pengguna(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }


    /**
     * Fungsi mengambil atau membaca atribut nama
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Fungsi mengubah atribut nama
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Fungsi membaca atribut alamat
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Fungsi mengubah atribut alamat
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void pinjam(Koleksi koleksi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int hitungDenda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
}
