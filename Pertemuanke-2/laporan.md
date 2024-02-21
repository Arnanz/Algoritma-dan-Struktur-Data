# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Adnan Arju Maulana Pasha </p>
<p align = "center"> NIM  : 2341720107 </p>
<p align = "center"> Prodi: TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas: 1B </p>

## Percobaan 1 : Deklarasi Class, Atribut dan Method

![alt text](image.png)

## Pertanyaan
1. Sebutkan dua karakteristik class atau object!<br>
Jawab : Encapsulation: Data seperti judul, pengarang, halaman, stok, dan harga dienkapsulasi dalam class Buku dengan akses modifier private sehingga hanya dapat diakses melalui method yang ada di dalam class tersebut.
Abstraction: Class Buku memiliki method tampilInformasi yang menyembunyikan detail implementasi dan hanya menampilkan informasi yang relevan kepada pengguna.

2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya!<br>
Jawab : Class Buku memiliki 5 atribut, yaitu:
judul (String),pengarang (String),halaman (int),stok (int),harga (int)

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
Jawab : Class Buku memiliki 4 method, yaitu:tampilInformasi(),terjual(int jml),restock(int jml),gantiHarga(int hrg)

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
Jawab : Ini adalah modifikasi kode programnya
![alt text](image-1.png)<br>
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
Jawab : menurut saya method restock() memiliki satu parameter berupa bilangan int karena parameter tersebut digunakan untuk menentukan jumlah tambahan stok yang akan ditambahkan kembali ke dalam persediaan buku. Dengan demikian, pengguna dapat menentukan seberapa banyak stok tambahan yang ingin ditambahkan melalui parameter tersebut.
6. Commit dan push kode program ke Github
