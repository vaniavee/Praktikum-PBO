/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;
import java.util.List;
/**
 *
 * @author Asus
 */
// Untuk memvalidasi data pasien dalam sistem klinik.
public class DataChecker {
    // Memeriksa apakah nama pasien valid.
    public static boolean isValidName(String name) { // Method ini mengembalikan true jika nama valid, dan false jika tidak valid.
        // name.trim → digunakan untuk menghapus spasi di awal dan akhir string.
        // .isEmpty() → Mengecek apakah string kosong.
        return name != null && !name.trim().isEmpty(); // 
    }
    
    // Memeriksa apakah usia pasien valid.
    public static boolean isValidAge(int age) { // Method ini menerima usia pasien sebagai parameter dan mengecek apakah usianya masuk dalam batasan yang benar.
        // Memastikan usia lebih dari 0 (tidak negatif atau nol) dan kurang dari 90.
        return age > 0 && age < 90;
    }
}