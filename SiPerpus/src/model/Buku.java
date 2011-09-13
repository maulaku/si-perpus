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

    public boolean isTerlambat(Date tanggalPinjam,Date tanggalKembali){
        if(super.lamaPinjam(tanggalPinjam, tanggalKembali) > WAKTU_PINJAM)
            return true;
        else
            return false;
    }

    public boolean isTerlambat(){
        if(super.lamaPinjam(super.getTanggalPinjam(), super.getTanggalKembali()) > WAKTU_PINJAM)
            return true;
        else
            return false;
    }
    

}
