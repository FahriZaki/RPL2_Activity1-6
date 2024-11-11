/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.fahri.service;

//Melakukan import
import me.fahri.model.ModelMahasiswa;
import me.fahri.repository.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Anotasi ini menandakan bahwa kelas ini adalah bagian dari service layer dalam arsitektur aplikasi
@Service
public class MahasiswaService {

    //Menginjeksi instance dari MahasiswaRepository ke dalam MahasiswaService. 
    //Ini berarti Spring akan menyediakan implementasi dari repository secara otomatis.
    @Autowired
    private MahasiswaRepository repository;

    //Metode ini digunakan untuk menambahkan entitas ModelMahasiswa baru ke dalam database.
    public void addMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }

    //Metode ini digunakan untuk mengambil data mahasiswa berdasarkan ID.
    public ModelMahasiswa getMhs(int id) {
        return repository.findById(id).orElse(null);
    }

    //Metode ini digunakan untuk memperbarui data mahasiswa yang sudah ada.
    public void updateMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }

    //Metode ini digunakan untuk menghapus mahasiswa dari database berdasarkan ID.
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }

    //Metode ini digunakan untuk mengambil daftar semua mahasiswa dari database.
    public List<ModelMahasiswa> getAllMahasiswa() {
        return repository.findAll();
    }
}
