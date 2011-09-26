/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author puspa
 */
public class TestPengguna3 {
    public static void main(String[] args) {
        Date now = Calendar.getInstance().getTime();

        Pengguna testPengguna = new Pengguna();
        testPengguna.setNama("Tesy");

        Buku testBuku = new Buku("Laskar Pelangi");
        Buku testBuku1 = new Buku("Sang Pemimpi");

        testPengguna.tambahDaftarPinjaman(testBuku,now );
        System.out.println("Pengguna = " + testPengguna.getNama());
        System.out.println("Daftar Pinjaman");
        System.out.println(testPengguna.tampilPinjaman());

        try {
            testPengguna.kembalikanPinjaman(testBuku);
            System.out.println("Kembalikan buku");
        } catch (Exception ex) {
            Logger.getLogger(TestPengguna3.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Pengguna = " + testPengguna.getNama());
        System.out.println("Daftar Pinjaman");
        System.out.println(testPengguna.tampilPinjaman());


    }
}
