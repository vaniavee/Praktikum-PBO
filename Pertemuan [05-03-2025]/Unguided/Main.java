/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// by: Vania - 2311110031
// Program ini mensimulasikan sistem kendaraan (Car) yang terdiri dari beberapa komponen utama, seperti engine (mesin), transmission (transmisi), GPS (navigasi), security system.
// Setiap komponen dibuat dalam class terpisah, kemudian diintegrasikan dalam satu class yaitu Car.
public class Main {
    public static void main(String[] args) {
        // Komponen utama
        Engine engine = new Engine("V6 Turbo", 320);
        Transmission transmission = new Transmission("Manual", 5);
        GPS gps = new GPS();
        Security security = new Security();
        
        // Membuat objek mobil dengan semua komponennya
        Car myCar = new Car("Nissan GTR", engine, transmission, gps, security);
        System.out.println("========================");
        System.out.println("       DRIVE DAY        ");
        System.out.println("========================");
        
        // Menampilkan informasi mobil
        myCar.displayCarInfo();
        System.out.println("========================");
        
        // Cek keamanan
        myCar.getSecurity().disableAlarm(); // Matikan alarm
        myCar.getSecurity().unlockCar();   // Unlock mobil sebelum menyalakan mesin
        System.out.println("========================");
        
        // Menyalakan mobil
        myCar.startCar();
        System.out.println("========================");
        
        // Mengatur destinasi
        myCar.getGPS().setDestination("Jakarta");
        System.out.println("========================");
        
        // Mobil berganti menggunakan gigi 2
        myCar.drive(2); 
        System.out.println("========================");
        
        // Berhenti, mematikan mesin, dan mengunci mobil
        myCar.stopCar();
        System.out.println("========================");
 
        // Mengaktifkan alarm setelah mobil berhenti dan dikunci
        myCar.getSecurity().enableAlarm();
        
        System.out.println("=============================");
        System.out.println(" Anda Telah Sampai di Tujuan ");
        System.out.println("=============================");
    }
}
