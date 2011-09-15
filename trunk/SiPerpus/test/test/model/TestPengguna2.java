/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.util.Calendar;
import java.util.Date;
import model.*;

/**
 *
 * @author puspa
 */
public class TestPengguna2 {

    public static void main(String[] args) {
        Pengguna testPengguna = new Pengguna();
        testPengguna.setNama("Tesy");

        Buku testBuku = new Buku();
        testBuku.setJudul("Laskar Pelangi");
        System.out.println("judul = "+testBuku.getJudul());


        Buku testBuku1 = new Buku();
        testBuku1.setJudul("Sang Pemimpi");
        System.out.println("judul = "+testBuku1.getJudul());

        Date now = Calendar.getInstance().getTime();
        Date yesterday = new Date(111, 7, 1);

        testPengguna.tambahDaftarPinjaman(testBuku, yesterday);
        testPengguna.tambahDaftarPinjaman(testBuku1, yesterday);

        System.out.println("Pengguna = "+testPengguna.getNama());
        System.out.println("Daftar Pinjaman");
        System.out.println(testPengguna.tampilPinjaman());


    }
}
