/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity2_50421445;

/**
 *
 * @author Fahri
 */
public class Activity2_50421445 {

    public static void main(String[] args) {
        //Membuat Objek yang sudah kita buat pada Mahasiswa dan memberikan isi untuk nama, npm, umur
        Mahasiswa mahasiswa = new Mahasiswa("Fahri", "50421445", 21);
        mahasiswa.tampilkanData();
        System.out.println();
        
        //Membuat Objek yang sudah kita buat pada MahasiswaSarjana dan memberikan isi untuk nama, npm, umur, dan jurusan
        MahasiswaSarjana mahasiswasarjana = new MahasiswaSarjana("Zaki", "50421554", 20, "Informatika");
        mahasiswasarjana.tampilkanData();
        
    }
}
