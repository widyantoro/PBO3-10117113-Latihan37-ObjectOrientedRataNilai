/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan37.objectorientedratanilai;

import java.util.Scanner;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program menentukan rata rata nilai
 * 
 */
public class NilaiMahasiswa {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double hitungTotal(int parNilaiMhs, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
    return totalNilaiMhs;}

    public double hitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
}
