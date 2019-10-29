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
class Data extends Siswa{
    
    int usia;

    public Data(String nama, int usia, String jeniskelamin, String nohp) {
        super(nama, jeniskelamin, nohp);
        this.usia = usia;
    }
    
   public void info(){
       System.out.println("Usia :"+ this.usia);
       super.info();
   }
}