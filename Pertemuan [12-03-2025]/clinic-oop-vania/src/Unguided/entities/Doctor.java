/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Asus
 */
// Deklarasi Kelas
public class Doctor {
    // Atribut Kelas
    private String name; // Nama dokter
    private String doctorId; // ID unik untuk setiap dokter, digunakan sebagai identifikasi.
    private String specialization; //  Spesialisasi dokter
    
    // Constructor
    public Doctor(String doctorId, String name, String specialization){
        this.name = name;
        this.doctorId = doctorId;
        this.specialization = specialization;
    }
    
    // Setter
    // untuk mengubah nilai atribut privat.
    // Mengubah nilai atribut name (nama dokter).
    public void setName(String name){
        this.name = name;
    }
    // Mengubah nilai atribut doctorId (ID dokter).
    public void setDoctorId(String doctorId){
        this.doctorId = doctorId;
    }
    
    // Mengubah nilai atribut specialization (spesialisasi dokter).
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    
    // Getter
    // Mengembalikan nilai atribut name (nama dokter).
    public String getName(){
        return name;
    } 
    
    // Mengembalikan nilai atribut doctorId (ID dokter).
    public String getDoctorId(){
        return doctorId;
    }
    
    // Mengembalikan nilai atribut specialization (spesialisasi dokter).
    public String getSpecialization(){
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorId + ", Name: " + name + ", Specialization: " + specialization;
    }
}
