/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// Membuat class dengan nama Engine.
// Class engine digunakan untuk menyalakan mobil. 
// Mesin terdiri dari komponen type dan horsepower. 
public class Engine { // class bisa diakses dari package mana pun
    private String type; // tipe mesin (contoh: V6, V8)
    private int horsepower; // tenaga mesin dalam HP
    
    // Constructor
    public Engine(String type, int horsepower) {
        this.type = type; // Menginisiasi nilai atribut type saat membuat objek
        this.horsepower = horsepower; // Menginisiasi nilai atribut horsepower saat membuat objek
    }
    // Fungsi get digunakan untuk mengambil nilai atribut private dari luar class
    // Mengembalikan nilai type
    public String getType() {
        return type;
    }
    
    // Mengembalikan nilai horsepower
    public int getHorsepower() {
        return horsepower;
    }
    // Menyalakan mesin dan mencetak pesan mesin menyala
    public void startEngine() {
        System.out.println("Engine " + type + " started with " + horsepower + " HP.");
    }
    
    // Mematikan mesin dan mencetak pesan mesin mati
    public void stopEngine() {
        System.out.println("Engine " + type + " stopped ");
    }
}
