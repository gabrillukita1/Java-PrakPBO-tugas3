/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PersegiPanjang extends Balok implements MenghitungBidang{

    public PersegiPanjang(double tinggi, double panjang, double lebar) {
        super(tinggi, panjang, lebar);
    }
    
    public double getLuas(){
        return super.getPanjang()*super.getLebar();
    }
    
    public double getKeliling(){
        return 2*(super.getPanjang()+super.getLebar());
    }
    
    
    @Override
    public void luas() {
        System.out.println("Luas Persegi Panjang: " + getLuas());
    }

    @Override
    public void keliling() {
        System.out.println("Keliling Persegi Panjang: " + getKeliling());
    }
    
}
