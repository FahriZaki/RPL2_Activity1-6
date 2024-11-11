/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity1_50421445;
import java.util.Scanner;
/**
 *
 * @author Fahri
 */
public class Activity1_50421445 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan npm anda: ");
        String npm = input.nextLine();
        
        System.out.println("Masukkan umur anda: ");
        int umur = input.nextInt();
        
        System.out.println("Nama anda adalah " + nama);
        System.out.println("Npm anda adalah " + npm);
        System.out.println("Umur anda adalah " + umur + " Tahun");
    }
}
