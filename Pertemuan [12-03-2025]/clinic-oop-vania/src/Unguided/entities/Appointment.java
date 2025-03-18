/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;
import java.time.LocalDate; // untuk menangani tanggal janji temu secara spesifik menggunakan tipe data LocalDate.
/**
 *
 * @author Asus
 */
// Deklarasi Kelas
// Untuk merepresentasikan data janji temu antara dokter dan pasien.
public class Appointment {
    // Atribut Kelas
    private String appointmentId; // ID janji temu 
    private Doctor doctor; // Objek dokter yang terlibat dalam janji temu.
    private Patient patient; // Objek pasien yang membuat janji temu.
    private LocalDate appointmentTime; // Waktu janji temu dalam format tanggal.
    private String diagnosis; //Diagnosis

    // Constructor
    // Untuk menginisialisasi objek Appointment
    public Appointment(Doctor doctor, Patient patient, LocalDate appointmentTime, String diagnosis) {
        this.doctor = doctor; // Objek dari kelas Doctor
        this.patient = patient; // Objek dari kelas Patient
        this.appointmentTime = appointmentTime; // Tanggal janji temu dalam format LocalDate
        this.diagnosis = diagnosis; // Diagnosis yang diberikan kepada pasien
    }
    // Getter
    // Mengembalikan nilai ID janji temu
    public String getAppointmentId() {
        return appointmentId;
    }
    
    // Mengembalikan objek dokter yang terlibat dalam janji temu.
    public Doctor getDoctor() {
        return doctor;
    }
    // Mengembalikan objek pasien yang membuat janji temu.
    public Patient getPatient() {
        return patient;
    }
    // Mengembalikan tanggal janji temu.
    public LocalDate getAppointmentTime() {
        return appointmentTime;
    }
    
    // Mengembalikan diagnosis yang diberikan
    public String getDiagnosis() {
        return diagnosis;
    }
    
    @Override
    public String toString() {
        return "Appointment: " + patient.getName() + " with Dr. " + doctor.getName() +
                " at " + appointmentTime;
    }
}
