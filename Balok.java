/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Balok implements MenghitungRuang{
    private double tinggi;
    private double panjang;
    private double lebar;

    public Balok(double tinggi, double panjang, double lebar) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getLuasPermukaan(){
        return 2*(getPanjang()*getLebar()) + 2*(getPanjang()*getTinggi()) + 2*(getLebar()*getTinggi());
    }
    
    public double getVolume(){
        return panjang * lebar * tinggi;
    }

    @Override
    public void volume() {
         System.out.println("Luas Volume Balok: " + getVolume());
    }

    @Override
    public void luasPermukaan() {
        System.out.println("Luas Permukaan Balok: " + getLuasPermukaan());
    }
 
}
