Latihan UKL 1
Program ini berfungsi sebagai kalkulator biaya ekspedisi untuk menghitung total biaya pengiriman paket. Cara kerjanya adalah dengan meminta lima input dari pengguna: berat (kg), jarak (km), serta dimensi paket (panjang, lebar, dan tinggi). Logika program kemudian menentukan biaya jarak menggunakan if-else, di mana jarak 10 km ke bawah menggunakan tarif Rp 4.250/kg, sementara jarak di atas itu menggunakan tarif Rp 6.000/kg. Selain itu, program juga menghitung volume paket; jika volume melebihi 100 cm³, biaya tambahan tetap sebesar Rp 50.000 akan dikenakan. Total biaya akhir adalah hasil penjumlahan dari biaya jarak dan biaya volume tersebut.

<img width="397" height="326" alt="Screenshot 2025-11-03 095913" src="https://github.com/user-attachments/assets/402f3008-b8e4-45d0-83f5-5ed50e399581" />

Latihan UKL 2
Program ini memiliki fungsi sederhana untuk menentukan apakah sebuah bilangan bulat yang dimasukkan pengguna termasuk ganjil atau genap. Cara kerjanya adalah dengan mengambil satu input bilangan, lalu menggunakan operator modulus (% 2) untuk mengecek sisa hasil baginya. Jika sisa hasil bagi adalah 0, program akan mencetak "GENAP", namun jika sisa hasil baginya bukan 0 (melainkan 1), program akan mencetak "GANJIL".
<img width="299" height="121" alt="Screenshot 2025-11-03 095855" src="https://github.com/user-attachments/assets/582a66cb-9e20-4cbf-a4ee-35bc143c7ed1" />



Latihan UKL 3
Program ini berfungsi untuk menghitung nilai faktorial ($n!$) dari sebuah bilangan bulat positif yang dimasukkan oleh pengguna. Alur kerjanya adalah dengan meminta satu input bilangan (n) dan menginisialisasi variabel hasilFaktorial (bertipe long untuk menampung angka besar) dengan nilai 1. Program kemudian mengeksekusi perulangan for yang berjalan dari 1 hingga n. Di setiap iterasi, hasilFaktorial akan dikalikan dengan angka iterasi saat itu, sehingga mengakumulasi nilai faktorial. Setelah perulangan selesai, nilai faktorial akhir akan ditampilkan.

<img width="561" height="110" alt="Screenshot 2025-11-03 095827" src="https://github.com/user-attachments/assets/31929be5-e9f2-48f5-b818-601a514b769f" />



Latihan UKL 4
Program ini berfungsi untuk menghitung volume sebuah tabung, dengan penekanan utama pada implementasi konsep fungsi (method). Cara kerjanya adalah dengan memisahkan logika. Fungsi main hanya bertugas untuk berinteraksi dengan pengguna, yaitu meminta input jari-jari dan tinggi tabung. Setelah input didapat, fungsi main akan memanggil fungsi terpisah bernama hitungVolumeTabung sambil mengirimkan kedua nilai input tersebut sebagai parameter. Fungsi hitungVolumeTabung inilah yang melakukan perhitungan rumus $\pi r^2 h$ (menggunakan Math.PI dan Math.pow) dan mengembalikan hasil akhirnya (return value) ke fungsi main untuk ditampilkan.

<img width="392" height="156" alt="Screenshot 2025-11-03 095802" src="https://github.com/user-attachments/assets/fab4f4d4-a051-45ef-9dbe-19f144bf37ba" />


Latihan UKL 5
Program ini berfungsi sebagai alat rekapitulasi nilai untuk menghitung total dan nilai rata-rata dari sekelompok siswa. Cara kerjanya dimulai dengan meminta input jumlah siswa yang akan didata. Berdasarkan jumlah tersebut, program akan melakukan perulangan for untuk meminta nilai dari setiap siswa, satu per satu. Setiap nilai yang dimasukkan akan dijumlahkan dan diakumulasikan ke dalam variabel totalNilai. Setelah semua nilai siswa terkumpul dan perulangan selesai, program akan menghitung rata-rata dengan membagi totalNilai dengan jumlahSiswa, lalu menampilkan kedua hasil rekapitulasi tersebut.


<img width="384" height="266" alt="Screenshot 2025-11-03 095733" src="https://github.com/user-attachments/assets/473b1998-a603-4055-8fee-171d0bcf8fbb" />

Latihan UKL 6
Program ini berfungsi untuk melakukan operasi penjumlahan matematis antara dua buah matriks (Matriks A + Matriks B) yang memiliki ordo (baris dan kolom) identik. Program ini bekerja dengan terlebih dahulu meminta pengguna menentukan ordo. Kemudian, program menggunakan perulangan bersarang (nested loop) untuk meminta pengguna mengisi setiap elemen pada indeks [i][j] dari Matriks A, dan mengulangi proses yang sama untuk Matriks B. Setelah kedua matriks terisi, program kembali menggunakan nested loop untuk melakukan penjumlahan, di mana setiap elemen dijumlahkan dengan elemen di posisi yang sama (matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j]). Terakhir, matriks hasil penjumlahan tersebut akan ditampilkan ke layar.

<img width="361" height="436" alt="Screenshot 2025-11-03 095532" src="https://github.com/user-attachments/assets/d024698f-875a-4378-9363-477270b67e88" />
