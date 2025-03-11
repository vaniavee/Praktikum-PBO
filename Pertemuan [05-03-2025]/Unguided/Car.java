/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Asus
 */
// Membuat kelas Car yang digunakan untuk menyatukan seluruh komponen (Engine, Transmission, Navigation, dan Security) menjadi satu sistem kendaraan
public class Car {
    // atribut bersifat private (hanya bisa diakses langsung dari dalam kelas ini)
    private String brand; // merek mobil
    private Engine engine; // objek dari kelas engine (mengatur mesin mobil)
    private Transmission transmission; // objek dari kelas transmission (mengatur transmisi mobil (jumlah gigi, dll))
    private GPS gps; // objek dari kelas gps (mengatur navigasi mobil)
    private Security security; // objek dari kelas security (mengatur keamanan mobil)
    
    // Konstruktor
    public Car(String brand, Engine engine, Transmission transmission, GPS gps, Security security) {
        this.brand = brand; // mengisi atribut brand dengan paramater brand
        this.engine = engine; // mengisi atribut engine dengan paramater engine
        this.transmission = transmission; // mengisi atribut transmission dengan paramater transmission
        this.gps = gps; // mengisi atribut gps dengan paramater gps
        this.security = security; // mengisi atribut security dengan paramater security
    }
    
    // Method untuk menyalakan mobil
    public void startCar() {
        // mengecek apakah mobil terkunci
        if (!security.isLocked()) {
            System.out.println("Starting car: " + brand);
            // menyalakan mesin
            engine.startEngine();
        // jika mobil masih terkunci maka akan muncul peringatan
        } else {
            System.out.println("Car is locked! Unlock it first.");
        }
    }
    
    // Method untuk mengemudikan mobil
    public void drive(int gear) {
        // mengecek apakah mobil terkunci dulu
        if (!security.isLocked()) {
            System.out.println(brand + " is driving...");
            // pindah ke gigi yang diminta
            transmission.shiftGear(gear);
            // mengaktifkan navigasi saat jalan
            gps.startGPS(); 
        // jika mobil masih terkunci maka akan muncul peringatan
        } else {
            System.out.println("Car is locked! Unlock it first.");
        }
    }
    
    // Method untuk menghentikan mobil
    public void stopCar() {
        System.out.println(brand + " is stopping...");
        // Mesin dimatikan
        engine.stopEngine();
        // Navigasi GPS dimatikan
        gps.stopGPS();
        // Mobil dikunci otomatis setelah berhenti
        security.lockCar(); // Kunci mobil otomatis saat berhenti
    }
    
    // Method untuk menampilkan informasi mobil
    public void displayCarInfo() {
        // merek mobil
        System.out.println("Car Brand: " + brand);
        // tipe mesin dan tenaga
        System.out.println("Engine Type: " + engine.getType() + ", Horsepower: " + engine.getHorsepower());
        // jenis transmisi
        System.out.println("Transmission Type: " + transmission.getTransmissionType() + ", Gears: " + transmission.getNumberOfGears());
    }
    
    // Method untuk mengakses objek GPS mobil
    public GPS getGPS() {
        return gps;
    }

    // Method untuk mengakses objek security milik mobil
    // untuk mengunci/ membuka kunci atau mengaktifkan alarm dari luar kelas car
    public Security getSecurity() {
        return security;
    }
}
