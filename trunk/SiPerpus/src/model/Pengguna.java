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
    public static int MAX_KOLEKSI_PINJAMAN=10;
    private int jumlahPinjaman=0;
    private Koleksi pinjaman[]= new Koleksi[MAX_KOLEKSI_PINJAMAN];
    
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

    public int hitungDenda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the jumlahPinjaman
     */
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    /**
     * @param jumlahPinjaman the jumlahPinjaman to set
     */
    public void setJumlahPinjaman(int jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

   public void tambahPinjaman(Koleksi kol) {
        if (jumlahPinjaman < MAX_KOLEKSI_PINJAMAN) {
            pinjaman[jumlahPinjaman] = kol;
            jumlahPinjaman++;
        } else {
            System.out.println("Jumlah pinjaman sudah lebih dari 10");
        }
    }


    public String tampilPinjaman() {
        String result = "";
        if (jumlahPinjaman < 1) {
            result = "anda tidak pinjam apa-apa";
        } else {
            for (int i = 0; i < jumlahPinjaman; i++) {
                result = result + pinjaman[i].getJudul() + "\n";
            }
        }
        return result;
    }

}
