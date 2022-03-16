package com.pemesanan.tiket;
import java.util.*;
import java.util.Scanner;

public class pemesanan {

    public static void SetTiket() {
        System.out.println("Daftar Rute Domestik : ");
        Set <String> domestik = new LinkedHashSet <String>();
        domestik.add("Banda Aceh");
        domestik.add("Jakarta");
        domestik.add("Bali");
        domestik.add("Pontianak");
        domestik.add("Jayapura");
        for (String cetak : domestik) {
            System.out.println("" + cetak);
        }
    }

    public static void ListTiket() {
        System.out.println("\nDaftar Rute Internasional: ");
        List<String> internasional = new LinkedList<String>();
        internasional.add("Melbourne");
        internasional.add("Hong Kong");
        internasional.add("Amsterdam");
        internasional.add("Singapura");
        internasional.add("Bangkok");
        for (int i = 0; i <  internasional.size(); i++) {
            System.out.println(internasional.get(i));
        }
    }

    public static void MapTiket() {
        System.out.println("\nDaftar Kode Rute : ");
        Map<String, String> kode = new LinkedHashMap<String, String>();
        kode.put("Banda Aceh = ", "1");
        kode.put("Jakarta    = ", "2");
        kode.put("Bali       = ", "3");
        kode.put("Pontianak  = ", "4");
        kode.put("Jayapura   = ", "5");
        kode.put("Melbourne  = ", "6");
        kode.put("Hongkong   = ", "7");
        kode.put("Amsterdam  = ", "8");
        kode.put("Singapura  = ", "9");
        kode.put("Bangkok    = ", "10");
        for (Map.Entry<String, String> map : kode.entrySet()) {
            System.out.println("" + map.getKey() + " " + map.getValue());
        }
    }

    public static void Konfirmasi() {
        int pilihan;
        Scanner aa = new Scanner(System.in);
        System.out.println("Terima Kasih Sudah Melakukan Pemesanan");
        System.out.print("Ingin Melakukan Pemesanan Kembali? (1 = Ya, 2 = Tidak) :  ");
        pilihan = (char) aa.nextInt();
        if (pilihan == 1){
            PesanTiket();
        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        PesanTiket();
    }

    public static void PesanTiket() {
        System.out.println("\n======================================");
        System.out.println("Selamat Datang di Bandara Soekarno-Hatta");
        System.out.println("Pemesanan Tiket Garuda Indonesia");
        System.out.println("======================================\n");

        SetTiket();
        ListTiket();
        MapTiket();

        System.out.println("\n_____");
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = sc.nextLine();

        System.out.println("Masukkan Kode Rute : ");
        int code = sc.nextInt();
        int harga = 0;

        if (code == 1){
            harga=900000;
        }else if (code == 2){
            harga=800000;
        }else if(code == 3){
            harga=750000;
        }else if(code == 4){
            harga=500000;
        }else if(code == 5){
            harga=95000;
        }else if(code == 6){
            harga=4900000;
        }else if(code == 7){
            harga=5500000;
        }else if(code == 8){
            harga=6000000;
        }else if(code == 9){
            harga=2400000;
        }else if(code == 10){
            harga=3400000;
        } else {
            System.out.println("Masukkan Kode Yang Benar!");
            System.exit(0);
        }

        System.out.println("Masukkan Jumlah Pemesanan Tiket : ");
        int jumlah = sc.nextInt();
        int total = harga * jumlah ;
        System.out.println("_____");

        System.out.println("\n============================================");
        System.out.println("            Detail Pemesanan Tiket               ");
        System.out.println("Penumpang         : " + nama);
        System.out.println("Jumlah Pemesanan  : " + jumlah);
        System.out.println("Total Harga       : " + total);
        System.out.println("=============================================");

        Konfirmasi();

    }
}