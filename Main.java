
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        
        do{
            System.out.println("\n\n-- INPUT --");
            System.out.println("[1] Balok");
            System.out.println("[2] Kerucut");
            System.out.println("[3] Exit");
            System.out.print("\nPilih menu: ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1 : 
                    System.out.print("Panjang\t: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Lebar\t: ");
                    double lebar = scanner.nextDouble();
                    System.out.print("Tinggi\t: ");
                    double tinggi = scanner.nextDouble();

                    Balok balok = new Balok(tinggi, panjang, lebar);
                    PersegiPanjang pp = new PersegiPanjang(tinggi, panjang, lebar);

                    System.out.println("\nOUTPUT");
                    pp.luas();
                    pp.keliling();
                    balok.volume();
                    balok.luasPermukaan(); 
                    break;

                case 2 :
                    System.out.print("Jari-Jari\t: ");
                    double jarijari = scanner.nextDouble();
                    System.out.print("Tinggi\t\t: ");
                    double tinggiKerucut = scanner.nextDouble();

                    Kerucut kerucut = new Kerucut(tinggiKerucut, jarijari);
                    Lingkaran lingkaran = new Lingkaran(tinggiKerucut, jarijari);

                    System.out.println("\nOUTPUT");
                    lingkaran.luas();
                    lingkaran.keliling();
                    kerucut.volume();
                    kerucut.luasPermukaan();
                    break;             
                
                case 3 :
                    System.exit(0);
                    break;
                    
                default :
                    System.out.println("Menu yang diinputkan tidak dikenali");
                    break;
            }
        }while(menu != 3);
        
    }
}
