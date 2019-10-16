/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118027_if_1_latihan37_rataratanilai;

import java.util.Scanner;

/**
 *
 * @author RYZEN
  */
public class NilaiMhs {  
    public int nilai;
    public double totalNilai;
    
    Scanner masuk = new Scanner(System.in);
    
    public double hitungNilai(int parNilai, int parJmlMhs){
        for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = masuk.nextInt();
            totalNilai += parNilai;
        }
        return totalNilai;
    }
    
    public double hitungRataRata(double totalNilai,int jmlMhs){
        return totalNilai/jmlMhs;
    }
}
