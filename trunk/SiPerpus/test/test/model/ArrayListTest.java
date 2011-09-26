/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author puspa
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList testArrayList = new ArrayList();

        Buku testBuku = new Buku("Siti Nurbaya");
//        testBuku.setJudul("Siti Nurbaya");
        System.out.println("ukuran arrayList ="+testArrayList.size());

        testArrayList.add(testBuku);
        
        System.out.println("ukuran arrayList ="+testArrayList.size());

        Buku testBuku2 = new Buku("Catatan Si Boy");
//        testBuku2.setJudul("Catatan Si Boy");

        testArrayList.add(testBuku2);

        System.out.println("ukuran arrayList ="+testArrayList.size());

        
        for (int i = 0; i < testArrayList.size(); i++) {
            Buku temp = (Buku) testArrayList.get(i);
            System.out.println("Judul :"+temp.getJudul());
        }
        

    }
}
