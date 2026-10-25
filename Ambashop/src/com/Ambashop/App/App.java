package com.Ambashop.App;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Selamat  Datang di Aplikasi Ambashop");
        Barang baju = new Barang("Baju", 100000);
        System.out.println(baju.namaBarang);
        System.out.println(baju.hargaBarang);
    }
    
}
