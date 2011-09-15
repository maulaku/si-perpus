/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author puspa
 */
public interface Peminjam {
    public void tambahDaftarPinjaman(Koleksi koleksi,Date tanggalPinjam);
    public int hitungDenda(Date tanggalPinjam);
}
