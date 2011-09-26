/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Koleksi;

/**
 *
 * @author puspa
 */
public class TestKoleksi2 {
    public static void main(String[] args) {
        // pengujian dengan tanggal pinjam kosong
        Koleksi test = new Koleksi("Harry Potter");
        try {
            test.setTanggalKembali(new Date(111, 8, 22));
            System.out.println("Hore benar");
        } catch (Exception ex) {
            Logger.getLogger(TestKoleksi2.class.getName()).log(Level.SEVERE, null, ex);
        }

        // pengujian dengan tanggal pinjam lebih akhir dibanding tanggal kembali
        Koleksi test1 = new Koleksi("Siti Aisyah");
        try {
            test1.setTanggalPinjam(new Date(111,8,30));
            test1.setTanggalKembali(new Date(111, 8, 22));
            System.out.println("Hore benar");
        } catch (Exception ex) {
            Logger.getLogger(TestKoleksi2.class.getName()).log(Level.SEVERE, null, ex);
        }

        // pengujian pengisian tanggal kembali yang benar
        Koleksi test2 = new Koleksi("Siti Nurbaya");
        try {
            test2.setTanggalPinjam(new Date(111,8,1));
            test2.setTanggalKembali(new Date(111, 8, 22));
            System.out.println("Hore benar");
        } catch (Exception ex) {
            Logger.getLogger(TestKoleksi2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
