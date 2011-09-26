/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author puspa
 */
public class Pengguna implements Peminjam {

    private String nama;
    private String alamat;
    public static int MAX_KOLEKSI_PINJAMAN = 10;
    private ArrayList<Koleksi> daftarPinjaman = new ArrayList<Koleksi>();

    /**
     * Konstruktor
     */
    public Pengguna() {
    }

    /**
     * Konstruktor
     * @param nama
     * @param alamat
     */
    public Pengguna(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    /**
     * Fungsi mengambil atau membaca atribut nama
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Fungsi mengubah atribut nama
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Fungsi membaca atribut alamat
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Fungsi mengubah atribut alamat
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int hitungDenda() {
        return 0;
    }

    /**
     * Fungsi untuk menghitung total denda di daftar pinjaman
     * @param tanggalPinjam
     * @return
     */
    public int hitungDenda(Date tanggalPinjam) {
        int result = 0;
        if (adaDaftarPinjamanTerlambat(tanggalPinjam)) {
            for (int i = 0; i < daftarPinjaman.size(); i++) {
                result = result + daftarPinjaman.get(i).hitungDenda(tanggalPinjam);
            }
            return result;
        } else {
            return 0;
        }
    }

    
    /**
     * Fungsi untuk menambah daftar pinjaman
     * @param kolPinjam
     * @param tanggalPinjam
     */
    public void tambahDaftarPinjaman(Koleksi kolPinjam,Date tanggalPinjam) {
        Koleksi tempPinjam = kolPinjam;
        tempPinjam.setTanggalPinjam(tanggalPinjam);
        if (daftarPinjaman.isEmpty()) {
            // daftar Pinjaman kosong
            daftarPinjaman.add(tempPinjam);
        } else {
            // daftar Pinjaman isi
            if (daftarPinjaman.size() < MAX_KOLEKSI_PINJAMAN) {
                // jumlah Pinjaman kurang dari maksimum
                // cek terlambat
                if (!adaDaftarPinjamanTerlambat(tanggalPinjam)) {
                    // tidak ada yang terlambat
                    daftarPinjaman.add(tempPinjam);
                } else {
                    // ada yang terlamabat
                    System.out.println("Ada pinjaman terlambat");
                }
            } else {
                // jumlah Pinjaman lebih dari maksimum
                System.out.println("Jumlah pinjaman sudah lebih dari "
                        + MAX_KOLEKSI_PINJAMAN);
            }
        }
    }

    /**
     * Fungsi untuk mengetahui ada tidaknya pinjaman yang terlambat
     * @param tanggalPinjam adalah tanggal pinjam koleksi
     * @param tanggalKembali adalah tanggal kembali koleksi
     * @return
     */
    public boolean adaDaftarPinjamanTerlambat(Date tanggalPinjam, Date tanggalKembali) {
        for (int i = 0; i < daftarPinjaman.size(); i++) {
            if (daftarPinjaman.get(i).isTerlambat(tanggalPinjam, tanggalKembali)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Fungsi untuk mengetahui ada tidaknya pinjaman yang terlambat
     * @param tanggalKembali adalah tanggal kembali koleksi
     * @return
     */
    public boolean adaDaftarPinjamanTerlambat(Date tanggalKembali) {
        for (int i = 0; i < daftarPinjaman.size(); i++) {
            Date tanggalPinjam = daftarPinjaman.get(i).getTanggalPinjam();
            if (daftarPinjaman.get(i).isTerlambat(tanggalPinjam, tanggalKembali)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Fungsi untuk mengetahui ada tidaknya koleksi dalam daftar pinjaman
     * @param kol adalah koleksi yang ingin dicari
     * @return
     */
    public boolean adaKoleksi(Koleksi kol) {
        return daftarPinjaman.contains(kol);
    }

    /**
     * Fungsi untuk mengembalikan pinjaman koleksi
     * @param kol adalah koleksi yang dikembalikan
     */
    public void kembalikanPinjaman(Koleksi kol) throws Exception{
        Date now = Calendar.getInstance().getTime();
        try {
            kol.setTanggalKembali(now);
        } catch (Exception ex) {
            Logger.getLogger(Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (daftarPinjaman.isEmpty()) {
            // daftar pinjaman kosong
            throw new Exception("Tidak ada pinjaman");
        } else {
            if (adaKoleksi(kol)) {
                // pinjaman ada di daftar pinjam
                daftarPinjaman.remove(kol);
            } else {
                // koleksi tidak ada di daftar pinjaman
                System.out.println("Tidak ada koleksi di daftar");
            }
        }
    }

    public String tampilDaftarPinjaman(){
        String result = "";
        if(daftarPinjaman.isEmpty()){
            System.out.println("anda tidak pinjam apa-apa");
        } else{
            for (int i = 0; i < daftarPinjaman.size(); i++) {
                result+=daftarPinjaman.get(i).getJudul()+"\t"
                        +daftarPinjaman.get(i).getTanggalPinjam() + "\n";;
            }
        }
        return result;
    }

    public String tampilPinjaman() {
        String result = "";
        if (daftarPinjaman.isEmpty()) {
            result = "anda tidak pinjam apa-apa";
        } else {
            for (int i = 0; i < daftarPinjaman.size(); i++) {
                result = result + daftarPinjaman.get(i).getJudul() +"\t"
                        +daftarPinjaman.get(i).getTanggalPinjam() + "\n";
            }
        }
        return result;
    }
}
