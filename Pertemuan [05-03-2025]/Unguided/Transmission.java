/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// Mendeklarasikan kelas bernama Transmission dengan atribut tipe transmission dan jumlah gear
public class Transmission {
    // Atribut bersifat private, hanya bisa di akses di dalam kelas Transmission
    private String transmissionType; // Menyimpan jenis transmisi (manual/automatic)
    private int numberOfGears; // Menyimpan jumlah gigi dalam transmisi
    
    // Constructor
    public Transmission(String transmissionType, int numberOfGears) {
        this.transmissionType = transmissionType;
        this.numberOfGears = numberOfGears;
    }
    // Mengembalikan jenis transmisi
    public String getTransmissionType() {
        return transmissionType;
    }
    
    // Mengembalikan jumlah gigi
    public int getNumberOfGears() {
        return numberOfGears;
    }
    // Method untuk mengganti ke gigi transmisi tertentu
    public void shiftGear(int gear) {
        // jika gear (gigi) lebih besar dari 0 & lebih kecil sama dengan "numberOfGear" maka gigi bisa diganti
        if (gear > 0 && gear <= numberOfGears) {
            System.out.println("Shifting to gear " + gear + " on a " + transmissionType + " transmission.");
        // jika tidak maka akan menampilkan error message
        } else {
            System.out.println("Invalid gear selection.");
        }
    }
}