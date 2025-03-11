/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// Membuat kelas dengan nama GPS dengan atribut destination (tujuan perjalanan)
// Kelas ini digunakan untuk mengarahkan perjalanan mobil ke tujuan
public class GPS { // kelas ini bisa diakses dari kelas lain
    private String destination; // atribut destination dalam kelas GPS yang hanya bisa diakses dalam class GPs

    public GPS() {
        this.destination = ""; // menginisiasi destination ke string kosong (belum ada tujuan yang diatur)
    }
    // Method untuk menentukan tujuan perjalanan
    public void setDestination(String destination) {
        this.destination = destination; // menyimpan tujuan baru ke dalam atribut
        System.out.println("Destination set to: " + destination);
    }
    
    // Method untuk memulai navigasi
    public void startGPS() {
        // Mengecek apakah "destination" kosong, jika sudah ada tujuan yang di input, maka akan ditampilkan pesan,
        if (!destination.isEmpty()) { 
            System.out.println("Navigating to " + destination + "...");
        // jika belum ada tujuan, maka akan ditampilkan error message
        } else {
            System.out.println("No destination set.");
        }
    }

    // Method untuk menghentikan navigasi
    public void stopGPS() {
        System.out.println("Navigation (GPS) stopped.");
    }
}
