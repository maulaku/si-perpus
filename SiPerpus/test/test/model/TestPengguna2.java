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
        System.out.println("judul = " + testBuku.getJudul());


        Buku testBuku1 = new Buku();
        testBuku1.setJudul("Sang Pemimpi");
        System.out.println("judul = " + testBuku1.getJudul());

        Date now = Calendar.getInstance().getTime();
        Date yesterday = new Date(111, 7, 3);

        //pinjam buku
        testPengguna.tambahDaftarPinjaman(testBuku, yesterday);
        testPengguna.tambahDaftarPinjaman(testBuku1, yesterday);

        System.out.println("Pengguna = " + testPengguna.getNama());
        System.out.println("Daftar Pinjaman");
        System.out.println(testPengguna.tampilPinjaman());

        System.out.println("terlambat = " + testPengguna.adaDaftarPinjamanTerlambat(now));
        System.out.println("denda  = " + testPengguna.hitungDenda(now));

        // kembalikan buku
        testPengguna.kembalikanPinjaman(testBuku);

        System.out.println("Ada "+testBuku.getJudul()+" di daftar Pinjam? " +testPengguna.adaKoleksi(testBuku));
        System.out.println("Pengguna = " + testPengguna.getNama());
        System.out.println("Daftar Pinjaman");
        System.out.println(testPengguna.tampilPinjaman());


    }
}
