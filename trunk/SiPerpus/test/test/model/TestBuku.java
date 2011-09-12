/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;

import java.util.Date;
import model.Buku;

/**
 *
 * @author puspa
 */
public class TestBuku {
    public static void main(String[] args) {
        Buku testBuku = new Buku();

//        testBuku.setTanggalPinjam(new Date(111,6,1));
//        testBuku.setTanggalKembali(new Date(111,8,1));

        System.out.println("Lama pinjam ="+
                testBuku.lamaPinjam(new Date(111,6,1), new Date(111,8,1)));

        System.out.println("Terlambat ="+
                testBuku.isTerlambat(new Date(111,6,1), new Date(111,8,1)));

    }
}
