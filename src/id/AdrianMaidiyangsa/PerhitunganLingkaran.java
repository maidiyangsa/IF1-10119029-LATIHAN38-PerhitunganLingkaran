/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program perhitungan lingkaran, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    Scanner scanner = new Scanner(System.in);
    double pi = Math.PI;
    double diameter;
    
    public void validasi(String diameter) {
        if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            masukkanDiameter();
        }
        else{
            this.diameter = Double.parseDouble(diameter);
        }
    }
    
    public void masukkanDiameter(){
        System.out.println("=======Perhitungan Lingkaran=======");
        System.out.print("Masukan nilai diameter lingkaran : ");
        validasi(scanner.next()); 
    }
    public double hitungJariJari(){        
        return diameter/2;
    }
    
    public double hitungLuas(){            
        return pi * hitungJariJari() * hitungJariJari();
    }
    
    public double hitungKeliling(){
        return 2 * pi * hitungJariJari();
    }
    
    public void tampilHasil(){
        System.out.println("====Perhitungan Lingkaran====");
        System.out.println("Luas Lingkaran = "+hitungLuas());
        System.out.println("Jari-Jari Lingkaran = "+hitungJariJari());
        System.out.println("Keliling Lingkaran = "+hitungKeliling());
    }
}
