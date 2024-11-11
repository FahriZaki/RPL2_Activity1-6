/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity2_50421445;

/**
 *
 * @author user
 */
public class MahasiswaSarjana extends Mahasiswa{
    //Membuat variable private agar hanya dapat dipanggil di class MahasiswaSarjana
    private String jurusan;
    
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan){
        //Memanggil data dari mahasiswa yaitu nama, npm, umur
        super(nama, npm, umur);
        //Membuat variable baru jurusan
        this.jurusan = jurusan;
    }
    
    //Membuat Polymorphism untuk mencetak jurusan di output
    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Jurusan: " + jurusan);
    }
}
