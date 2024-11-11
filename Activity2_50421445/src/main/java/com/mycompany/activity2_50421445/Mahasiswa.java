/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity2_50421445;

/**
 *
 * @author user
 */
public class Mahasiswa {
    //Membuat variable private agar hanya dapat dipanggil di class Mahasiswa
    private String nama;
    private String npm;
    private int umur;
    
    public Mahasiswa(String nama, String npm, int umur) {
        //Membuat variable untuk Mahasiswa yang terdiri dari nama,npm, dan umur
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    public void tampilkanData() {
        //Melakukan print terhadap nama, npm, dan umur
        System.out.println("Nama: " + nama);
        System.out.println("Npm: " + npm);
        System.out.println("Umur: " + umur);
    }
}
