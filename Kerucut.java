/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Kerucut implements MenghitungRuang {
    private double tinggiKerucut;
    private double jarijari;

    public Kerucut(double tinggiKerucut, double jarijari) {
        this.tinggiKerucut = tinggiKerucut;
        this.jarijari = jarijari;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double LuasAlas(){
        return Math.PI*jarijari*jarijari;
    }
    
    public double volumeKerucut(){
        return LuasAlas() * tinggiKerucut / 3;
    }
    
    public double luasSelimut(){
        return Math.sqrt(Math.pow(this.jarijari, 2) + Math.pow(tinggiKerucut, 2));
    }
    
    public double luasPermukaanKerucut(){
        return Math.PI * jarijari * (jarijari + luasSelimut());
    }

    @Override
    public void volume() {
        System.out.println("Volume Kerucut: " + volumeKerucut());
    }

    @Override
    public void luasPermukaan() {
        System.out.println("Luas Permukaan Kerucut: " + luasPermukaanKerucut());
    }
    
}
