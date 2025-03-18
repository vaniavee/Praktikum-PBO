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
// Untuk menghitung jumlah diagnosis yang telah dibuat dalam program
// Menggunakan variabel statis untuk menyimpan jumlah total diagnosis yang bertambah setiap kali ada diagnosis baru yang dibuat secara keseluruhan (global).
public class DiagnosisCounter {
    private static int diagnosisCount = 0; // menyimpan total diagnosis dari dokter
    
    // Menambah jumlah diagnosis
    public static void addDiagnosis() {
        diagnosisCount++; // menambah 1 ke variabel diagnosisCount setiap kali method ini dipanggil.
    }
    
    // Mengembalikan jumlah diagnosis
    public static int getDiagnosisCount() {
        return diagnosisCount; // Mengembalikan jumlah total diagnosis yang telah dihitung.
    }
}
