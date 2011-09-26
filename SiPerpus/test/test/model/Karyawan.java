/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author puspa
 */
public class Karyawan {

    private String nama;
    private Date tanggalLahir;

    public Karyawan() {
    }

    public Karyawan(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int hitungUmur(Date hariIni) throws Exception {
        if (tanggalLahir.before(hariIni)) {
            return (hariIni.getYear() - tanggalLahir.getYear());
        } else {
            throw new Exception("hari ini salah");
        }
    }

    public static void main(String[] args) {
        Karyawan test = new Karyawan();
        test.setTanggalLahir(new Date(111, 10, 1));
        Date now = Calendar.getInstance().getTime();
        try {
            System.out.println("umur : " + test.hitungUmur(now));
        } catch (Exception ex) {
            System.out.println("error : " + ex.getMessage());
        }
    }
}
