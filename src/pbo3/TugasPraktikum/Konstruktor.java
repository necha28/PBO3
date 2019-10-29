/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author necha
 */
public class Konstruktor {
    public static void main(String[] args) {
        Data Siswa1 = new Data("Arfina Devi",15,"Perempuan","085646360500");
        Data Siswa2 = new Data("Rensi Meila",15,"Perempuan","082338422545");
        Data Siswa3 = new Data("Adella Aishwara",15,"Perempuan","081382506640");
        
        System.out.println("\n Silahkan pilih yang ingin anda ketahui informasinya");
        System.out.println("1. Arfina Devi\n2. Rensi Meila\n3. Adella Aishwara");
        Scanner meow = new Scanner(System.in);
        int jawab = meow.nextInt();
        switch (jawab){
            case 1:
                System.out.println("Informasi Siswa");
                Siswa1.info();
                break;
            case 2:
                System.out.println("Informasi Siswa");
                Siswa2.info();
                break;
            case 3:
                System.out.println("Informasi Siswa");
                Siswa3.info();
                break;
            default:
                System.out.println("Mohon maaf pilihan tidak tersedia!");
                break;
        }
    }
}