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
public class Majalah extends Koleksi{

    public static int WAKTU_PINJAM = 3; // 3 hari
    public static int BIAYA_DENDA  = 2000; // biaya denda per hari
    private String ISSN;
    private String nomor;
    private String seri;

    /**
     * @return the ISSN
     */
    public String getISSN() {
        return ISSN;
    }

    /**
     * @param ISSN the ISSN to set
     */
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    /**
     * @return the seri
     */
    public String getSeri() {
        return seri;
    }

    /**
     * @param seri the seri to set
     */
    public void setSeri(String seri) {
        this.seri = seri;
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
