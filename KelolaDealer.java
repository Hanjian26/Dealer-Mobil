/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;

public class KelolaDealer {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int banyakMobil;
        //.....Memasukan Jumlah Banyak Mobil 
        System.out.print("Masukan Banyak Mobil : ");
        banyakMobil = keyboard.nextInt();
        System.out.println();

        Mobil[] jumlahMobil;
        jumlahMobil = new Mobil[banyakMobil];

        System.out.println("Jumlah Mobil Sebanyak : " + banyakMobil);

        Dealer dataDealer = new Dealer("Subur Motor", "Hanjian Listanto");
        //.....Memasukan Data Dealer
        dataDealer.setAlamat("Kalimantan Tengah");
        dataDealer.setNPWP("2626");

        System.out.println("Nama Dealer     : " + dataDealer.getNamaDealer());
        System.out.println("Nama Pemilik    : " + dataDealer.getPemilik());
        System.out.println("Alamat Dealer   : " + dataDealer.getAlamat());
        System.out.println("NPWP Dealer     : " + dataDealer.getNPWP());
        System.out.println();

        //.....Memasukan Data mobil
        for (int i = 0; i < banyakMobil; i++) {
            System.out.print("Masukan Warna Mobil     : ");
            String warnaMobil = keyboard.next();
            System.out.print("Masukan Merk Mobil      : ");
            String merkMobil = keyboard.next();

            jumlahMobil[i] = new Mobil();
            jumlahMobil[i].setWarna(warnaMobil);
            jumlahMobil[i].setMerk(merkMobil);

        }

        //.....Menampilkan Data Mobil.....
        System.out.println();
        System.out.println("======================================================");
        System.out.println("\t \t " + dataDealer.getNamaDealer());
        System.out.println("======================================================");
        System.out.println("No \t Warna \t Merk");
        for (int i = 0; i < banyakMobil; i++) {

            System.out.println((i + 1) + "\t" + jumlahMobil[i].getWarna() + " \t" + jumlahMobil[i].getMerk());
        }
        System.out.println("======================================================");
        System.out.println();

        //.....Memasukan Warna Mobil Yang Ingin Dicari.......
        System.out.println("Masukan Warna Mobil Yang Dicari : ");
        String cariMobil = keyboard.next();

        for (int i = 0; i < banyakMobil; i++) {
            if (cariMobil.equals(jumlahMobil[i].getWarna())) {
                System.out.println(jumlahMobil[i].getWarna() + "\t" + jumlahMobil[i].getMerk());
            }
        }

    }

}
