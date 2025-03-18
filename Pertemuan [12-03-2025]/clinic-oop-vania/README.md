# <h1 align="center"> 🚑 My Clinic Management System 🏥</h1>
<p align="center">Vania Noverina</p>
<p align="center">2311110031</p>

## 📣 Description
My Clinic Management System merupakan sebuah sistem klinik sederhana yang mencakup pengelolaan data dokter, pasien, janji temu (appointment), dan diagnosis. 

### Tujuan Sistem:
<pre>
✅ Menyimpan data dokter dan spesialisasinya.
✅ Menyimpan data pasien, termasuk usia dan penyakitnya.
✅ Membuat janji temu antara dokter dan pasien.
✅ Memeriksa validitas data pasien sebelum diproses.
✅ Menghitung total diagnosis yang telah diberikan oleh dokter.
</pre>

## 📍 Project Structure
```
Praktikum [12-03-2025]/
└── clinic-oop-vania/
    └── src/
        ├── Guided/
        │   ├── driver/
        │   │   ├── TestPackages.java
        │   ├── hargabuku/
        │   │   ├── KelasHarga.java
        │   ├── hargatoken/
        │   │   ├── KelasToken.java
        │   ├── modul4/
        │   │   ├── Animal.java
        │   │   ├── Cat.java
        │   │   ├── LibraryBook.java
        ├── Unguided/
        │   ├── entities/
        │   │   ├── Doctor.java
        │   │   ├── Patient.java
        │   │   ├── Appointment.java
        │   │   ├── DataChecker.java
        │   │   ├── DiagnosisCounter.java
        ├── Clinic.java
    └── README.md
```

## 📂 Class Description
### 1. Doctor.java
  Kelas ini merepresentasikan dokter.
  #### Terdapat 3 atribut, yaitu:
   - name (String): Nama dokter.
   - doctorId (String): ID unik untuk setiap dokter, digunakan sebagai identifikasi.
   - specialization (String): Spesialisasi dokter, seperti "Neurologist", "Dermatologist", dll.
     
  #### Methods:
  - setName() : Mengubah nilai atribut name (nama dokter).
  - setDoctorId() : Mengubah nilai atribut doctorId (ID dokter).
  - setSpecialization() : Mengubah nilai atribut specialization (spesialisasi dokter).
  - getName() : Mengembalikan (return) nilai atribut name (nama dokter).
  - getDoctorId() : Mengembalikan (return) nilai atribut doctorId (ID dokter).
  - getSpecialization() : Mengembalikan (return) nilai atribut specialization (spesialisasi dokter).
  - toString() : Mengembalikan (return) informasi objek doktor dalam format string.

---

### 2. Patient.java
Kelas ini merepresentasikan pasien.
#### Terdapat 4 atribut, yaitu:
- patientId (String): ID unik untuk setiap pasien, digunakan sebagai identifikasi.
- name (String): Nama pasien.
- age (int): Usia pasien.
- complaints (String): Keluhan pasien atau alasan pasien datang ke klinik.

### Methods:
- getPatiendId() : return nilai ID pasien.
- getName() : return nama pasien.
- getAge() : return usia pasien.
- getComplaints() : return keluhan penyakit pasien.
- toString() : Return informasi objek patient dalam format string.

---

### 3. Appointment.java
Kelas ini merepresentasikan appointment antara dokter dan pasien.
#### Terdapat 5 atribut, yaitu:
- appointmentId (String): ID janji temu (belum diinisialisasi dalam constructor).
- doctor (Doctor): Objek dokter yang terlibat dalam janji temu.
- patient (Patient): Objek pasien yang membuat janji temu.
- appointmentTime (LocalDate): Waktu janji temu dalam format tanggal.
- diagnosis (String): Diagnosis atau alasan janji temu.

#### Methods:
- getAppointmentId() : return ID janji temu (appointment).
- getDoctor() : return dokter yang terlibat dalam janji temu.
- getPatient() : return pasien yang membuat appointment.
- getDiagnosis() : return diagnosis yang diberikan.
- toString() : return informmasi objek appointment dalam format string.

---

### 4. DataChecker.java
Sebelum data pasien digunakan, dilakukan validasi menggunakan kelas DataChecker.
#### Memiliki 2 Validation Methods, yaitu:
- isValidName: Memeriksa apakah nama pasien valid.
- isValidAge: Memeriksa apakah usia pasien valid.

---

### 5. DiagnosisCounter.java
Menghitung jumlah diagnosis pasien.
#### Methods:
- addDiagnosis() : menambah jumlah diagnosis.
- getDiagnosisCount() : return jumlah diagnosis yang sudah dilakukan.

---

### 6. Clinic.java
#### Class Clinic merupakan `main class` atau entry point dari program. 
Kelas ini memeiliki beberapa fungsi seperti:
<pre>
    1. Membuat schedules appointment pasien dengan dokter.
    2. Menampilkan schedules appointment.
    3. Menampilkan data diagnosis penyakit pasien.
    4. Menampilkan total diagnosis dokter.
</pre>

---

## 📌 Cara Kerja Sistem
- Sistem akan membuat terlebih dahulu daftar dokter dan pasien.
- Sebelum pasien masuk ke sistem, `DataChecker` akan memverifikasi data.
- Jika data valid, sistem membuat janji temu dan menambah diagnosis ke `DiagnosisCounter`.
-  Semua data dokter, pasien, dan janji temu (appointment) akan ditampilkan di layar.

## 🚀 Output 
Setelah dijalankan, sistem akan mencetak daftar dokter, pasien, janji temu, diagnosis penyakit pasien, dan total diagnosis yang dibuat.

![Image](https://github.com/user-attachments/assets/c491d975-191d-4b98-ba87-c8d044f46e99) 



















