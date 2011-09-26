/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.util.ArrayList;
import model.Buku;
import model.Koleksi;

/**
 *
 * @author puspa
 */
public class ArrayTest1 {

    public static void main(String[] args) {
        ArrayList<Koleksi> testArrayList = new ArrayList<Koleksi>();

        Buku testBuku = new Buku("Siti Nurbaya");
//        testBuku.setJudul("Siti Nurbaya");
        System.out.println("ukuran arrayList =" + testArrayList.size());

        testArrayList.add(testBuku);

        System.out.println("ukuran arrayList =" + testArrayList.size());

        Buku testBuku2 = new Buku("Catatan Si Boy");
//        testBuku2.setJudul("Catatan Si Boy");

        testArrayList.add(testBuku2);

        System.out.println("ukuran arrayList =" + testArrayList.size());

        Buku testBuku3 = new Buku("Catatan Harian Naila");
//        testBuku3.setJudul("Catatan Harian Naila");

        testArrayList.add(testBuku3);

        System.out.println("ukuran arrayList =" + testArrayList.size());

        for (int i = 0; i < testArrayList.size(); i++) {
            System.out.println("Judul = " + testArrayList.get(i).getJudul());
        }

        testArrayList.remove(testBuku);

        System.out.println("ukuran arrayList =" + testArrayList.size());


        for (int i = 0; i < testArrayList.size(); i++) {
            System.out.println("Judul = " + testArrayList.get(i).getJudul());
        }


    }
}
