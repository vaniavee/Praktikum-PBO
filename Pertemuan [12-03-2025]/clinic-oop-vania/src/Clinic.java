/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;
// Paket yang digunakan:
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import Unguided.entities.Appointment;
import Unguided.entities.DataChecker;

// Import yang digunakan:
import java.util.ArrayList; // untuk pengelolaan data dalam bentuk list
import java.util.List; // untuk pengelolaan data dalam bentuk list
import java.time.LocalDate;// untuk mengelola tanggal janji temu.
/**
 *
 * @author Asus
 */
public class Clinic {
    public static void main(String[] args) {
        // Membuat dokter
        // Setiap dokter mempunyai ID, nama, dan spesialisasi.
        Doctor doctor1 = new Doctor("D01", "Dr. Felix Jeremia", "Cardiologist");
        Doctor doctor2 = new Doctor("D02", "Dr. Sheila Safira", "Dentist");
        Doctor doctor3 = new Doctor("D03", "Dr. Eirene Giovanni", "Neurologist");

        // Membuat pasien
        // Setiap pasien mempunyai ID, nama, umur, dan keluhan penyakit.
        Patient patient1 = new Patient("P01", "Olivia Benedicta", 29, "Takikardia");
        Patient patient2 = new Patient("P02", "Stella Monica", 30, "Toothache");
        Patient patient3 = new Patient("P03", "Stevio Swissen", 25, "Headache");

        // Validasi menggunakan DataChecker
        // Mengecek apakah data pasien valid
        // Memeriksa apakah nama pasien valid.
        if (!DataChecker.isValidName(patient1.getName()) || !DataChecker.isValidAge(patient1.getAge())) {
            System.out.println("Data pasien tidak valid!"); // Jika data tidak valid, program akan menampilkan pesan kesalahan dan berhenti (return).
            return;
        }
        
        // Memeriksa apakah usia pasien valid.
        if (!DataChecker.isValidName(patient2.getName()) || !DataChecker.isValidAge(patient2.getAge())) {
            System.out.println("Data pasien tidak valid!"); // Jika data tidak valid, program akan menampilkan pesan kesalahan dan berhenti (return).
            return;
        }

        // Membuat janji temu
        Appointment appointment1 = new Appointment(doctor1, patient1, LocalDate.of(2025, 1, 17), "High Blood Pressure");
        DiagnosisCounter.addDiagnosis();

        Appointment appointment2 = new Appointment(doctor2, patient2, LocalDate.of(2025, 2, 1), "Dental Caries");
        DiagnosisCounter.addDiagnosis();

        Appointment appointment3 = new Appointment(doctor3, patient3, LocalDate.of(2023, 2, 20), "Vertigo");
        DiagnosisCounter.addDiagnosis();
        System.out.println("-------------------------------------");
        System.out.println("       WELCOME TO VANIA CLINIC       ");
        System.out.println("-------------------------------------");
        // Menampilkan daftar dokter
        System.out.println("\n=== Data Dokter ===");
        System.out.println("ID: " + doctor1.getDoctorId() + ", Nama: " + doctor1.getName() + ", Spesialisasi: " + doctor1.getSpecialization());
        System.out.println("ID: " + doctor2.getDoctorId() + ", Nama: " + doctor2.getName() + ", Spesialisasi: " + doctor2.getSpecialization());
        System.out.println("ID: " + doctor3.getDoctorId() + ", Nama: " + doctor3.getName() + ", Spesialisasi: " + doctor3.getSpecialization());

        // Menampilkan daftar pasien
        System.out.println("\n=== Data Pasien ===");
        System.out.println("ID: " + patient1.getPatientId() + ", Nama: " + patient1.getName() + ", Usia: " + patient1.getAge());
        System.out.println("ID: " + patient2.getPatientId() + ", Nama: " + patient2.getName() + ", Usia: " + patient2.getAge());
        System.out.println("ID: " + patient3.getPatientId() + ", Nama: " + patient3.getName() + ", Usia: " + patient3.getAge());

        // Menampilkan daftar janji temu
        System.out.println("\n=== Data Janji Temu ===");
        System.out.println("Dokter: " + appointment1.getDoctor().getName() + " | Pasien: " + appointment1.getPatient().getName() +
                " | Tanggal: " + appointment1.getAppointmentTime() + " | Diagnosis: " + appointment1.getDiagnosis());
        System.out.println("Dokter: " + appointment2.getDoctor().getName() + " | Pasien: " + appointment2.getPatient().getName() +
                " | Tanggal: " + appointment2.getAppointmentTime() + " | Diagnosis: " + appointment2.getDiagnosis());
        System.out.println("Dokter: " + appointment3.getDoctor().getName() + " | Pasien: " + appointment3.getPatient().getName() +
                " | Tanggal: " + appointment3.getAppointmentTime() + " | Diagnosis: " + appointment3.getDiagnosis());

        // Menampilkan total diagnosis
        System.out.println("\nTotal diagnosis yang diberikan: " + DiagnosisCounter.getDiagnosisCount());
    }
}
