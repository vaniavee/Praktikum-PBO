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
public class Patient {
    // Atribut Kelas
    private String patientId; // ID unik untuk setiap pasien, digunakan sebagai identifikasi
    private String name; // Nama pasien
    private int age; // Umur pasien
    private String complaints; // Keluhan pasien

    // Constructor
    public Patient(String patientId, String name, int age, String complaints) {
        this.patientId = patientId; // ID pasien
        this.name = name; // Nama pasien
        this.age = age; // Umur pasien
        this.complaints = complaints; // Keluhan pasien (alasan datang ke klinik)
    }
    
    // Getter
    // Mengembalikan nilai ID pasien.
    public String getPatientId() {
        return patientId;
    }
    
    // Mengembalikan nilai nama pasien.
    public String getName() {
        return name;
    }
    
    // Mengembalikan nilai usia pasien (dalam bentuk integer).
    public int getAge(){
        return age;
    }
  
    // Mengembalikan keluhan pasien atau alasan mengapa pasien datang ke klinik.
    public String getComplaints() {
        return complaints;
    }
    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ". Complaints: " + complaints;
    }
}