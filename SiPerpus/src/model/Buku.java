/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author puspa
 */
public class Buku extends Koleksi{

    public static int WAKTU_PINJAM = 42; // 42 hari
    public static int BIAYA_DENDA  = 500; // biaya denda per hari
    private String ISBN;
    private String penulis;

    public Buku(String judul) {
        super(judul);
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean isTerlambat(Date tanggalPinjam,Date tanggalKembali){
        if(super.lamaPinjam(tanggalPinjam, tanggalKembali) > WAKTU_PINJAM)
            return true;
        else
            return false;
    }

    @Override
    public boolean isTerlambat(){
        if(isTerlambat(super.getTanggalPinjam(),super.getTanggalKembali()))
            return true;
        else
            return false;
    }

    public int lamaHariTerlambat(Date tanggalKembali){
        Date tanggalPinjam = super.getTanggalPinjam();
        if (isTerlambat(tanggalPinjam,tanggalKembali)){
            // terlambat
            return super.lamaPinjam(tanggalPinjam, tanggalKembali)- WAKTU_PINJAM;
        } else{
            // tidak terlambat
            return 0;
        }
    }

    @Override
    public int hitungDenda(Date tanggalKembali) {
        Date tanggalPinjam = super.getTanggalPinjam();
        if (isTerlambat(tanggalPinjam,tanggalKembali)){
            // terlambat
            return this.lamaHariTerlambat(tanggalKembali)*BIAYA_DENDA;
        } else{
            // tidak terlambat
            return 0;
        }
    }

    /**
     * @return the penulis
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * @param penulis the penulis to set
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
