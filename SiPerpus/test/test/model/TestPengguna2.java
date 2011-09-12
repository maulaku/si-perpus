/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import model.*;

/**
 *
 * @author puspa
 */
public class TestPengguna2 {

    public static void main(String[] args) {
        Pengguna testPengguna = new Pengguna();
        testPengguna.setNama("puspa");
        System.out.println("nama = "+testPengguna.getNama());

        Buku testBuku = new Buku();
        testBuku.setJudul("Ayat-ayat Cinta");

        System.out.println(testPengguna.tampilPinjaman());

        testPengguna.tambahPinjaman(testBuku);

        Buku testBuku1 = new Buku();
        testBuku1.setJudul("Siti Nurbaya");

        testPengguna.tambahPinjaman(testBuku1);

        System.out.println("Peminjam = "+testPengguna.getNama());
        System.out.println("Daftar Pinjaman ");
        System.out.println(testPengguna.tampilPinjaman());
    }
}
