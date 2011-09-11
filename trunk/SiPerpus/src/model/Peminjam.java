/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author puspa
 */
public interface Peminjam {

    public static int MAX_KOLEKSI_PINJAM=10;
    public void pinjam(Koleksi koleksi);
    public int hitungDenda();
}
