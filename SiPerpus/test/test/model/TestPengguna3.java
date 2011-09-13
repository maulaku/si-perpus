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
public class TestPengguna3 {
    public static void main(String[] args) {
        Buku testBuku1 = new Buku();
        testBuku1.setIdKoleksi("100");
        testBuku1.setJudul("Siti Nurbaya");

        Buku testBuku2 = new Buku();
        testBuku2.setIdKoleksi("101");
        testBuku2.setJudul("Java How to Program");

        Pengguna testPengguna = new Pengguna();
        testPengguna.setNama("Puspa");

        testPengguna.tambahDaftarPinjaman(testBuku1);
        testPengguna.tambahDaftarPinjaman(testBuku2);

        System.out.println("ada pinjam "+testBuku2.getJudul()+" ? "+testPengguna.adaKoleksi(testBuku2));
        System.out.println("daftar pinjaman");
        System.out.println(testPengguna.tampilDaftarPinjaman());

    }
}
