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
public class Dealer {

    private String namaDealer, alamat, pemilik, NPWP;

    private Mobil[] daftarMobil;
    
    Dealer(String namaDealer, String pemilik) {
        this.namaDealer = namaDealer;
        this.pemilik = pemilik;
    }

    
    public void setNamaDealer(String namaDealer) {
        this.namaDealer = namaDealer;
    }

    public String getNamaDealer() {
        return namaDealer;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getPemilik() {
        return pemilik;
    }
    
    public void setMobil(Mobil [] daftarMobil){
    this.daftarMobil = daftarMobil;
    }
    
    public Mobil[] getMobil(){
        return daftarMobil;
    }
}
