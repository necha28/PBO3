/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.TugasPraktikum;

/**
 *
 * @author necha
 */
class Siswa {
    String nama;
    String nohp;
    String jeniskelamin;
    
    //konstruktor
    public Siswa (String nama, String jeniskelamin, String nohp){
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.nohp = nohp;
    }
    public void info (){
        System.out.println("Nama:"+this.nama);
        System.out.println("Jenis Kelamin:"+this.jeniskelamin);
        System.out.println("No HP:"+this.nohp);
    }
}            
