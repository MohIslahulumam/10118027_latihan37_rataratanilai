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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMhs mhs = new NilaiMhs();
        Scanner masuk = new Scanner(System.in);
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = masuk.nextInt();
        
        mhs.hitungNilai(mhs.nilai, jmlMhs);
        mhs.hitungRataRata(mhs.totalNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",mhs.hitungRataRata(mhs.totalNilai, jmlMhs));
        System.out.println();
        System.out.println("Developed by : Fatahillah Satria Bima Seno");
    }

}
