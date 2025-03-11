/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// Mendeklarasikan kelas baru bernama Security
// Kelas ini berfungsi untuk mengatur keamanan kendaraan seperti kunci dan alarm
public class Security {
    // Menggunakan tipe boolean karena menyatakan True/False
    // karena private maka hanya bisa diakses dalam kelas Security
    private boolean isLocked; // status terkunci atau tidak 
    private boolean alarmOn; // status alarm aktif/tidak
    
    // Constructor
    public Security() {
        this.isLocked = true; // saat objek Security dibuat, kondisi mobil langsung terkunci
        this.alarmOn = false; // Alarm dalam keadaan mati/nonaktif secara default
    }
    // Method untuk mengunci kunci mobil
    public void lockCar() {
        isLocked = true; // diatur menjadi false
        System.out.println("Car is locked now.");
    }
    
    // Method untuk membuka kunci mobil 
    // dipanggil jika user ingin masuk ke mobil
    public void unlockCar() {
        isLocked = false; // di set jadi false
        System.out.println("Car is unlocked now.");
    }
    // Method untuk mengaktifkan alarm keamanan mobil
    // alarm aktif digunakan untuk memberi peringatan ketika ada upaya pencurian, atau ketika user keluar dari mobil 
    public void enableAlarm() {
        alarmOn = true;
        System.out.println("Alarm is activated.");
    }
    // Method untuk menonnaktifkan alarm
    // digunakan ketika pengguna sudah merasa aman, masuk ke mobil, atau ingin mematikan alarm palsu
    public void disableAlarm() {
        alarmOn = false;
        System.out.println("Alarm is deactivated.");
    }
    // Method untuk mengecek apakah mobil terkunci atau tidak
    public boolean isLocked() {
        return isLocked;
    }
    // Method untuk mengecek apakah alarm mobil aktif/tidak
    public boolean isAlarmOn() {
        return alarmOn;
    }
}
