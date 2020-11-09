/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Lingkaran extends Kerucut implements MenghitungBidang{

    public Lingkaran(double tinggiKerucut, double jarijari) {
        super(tinggiKerucut, jarijari);
    }
    
    public double getKelilingLing(){
        return Math.PI*super.getJarijari()*2;
    }

    @Override
    public void luas() {
        System.out.println("Luas Lingkaran: " + super.LuasAlas());
    }

    @Override
    public void keliling() {
       System.out.println("Keliling Lingkaran: " + getKelilingLing()); 
    }
    
}
