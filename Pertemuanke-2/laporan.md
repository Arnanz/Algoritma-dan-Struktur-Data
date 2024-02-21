# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Adnan Arju Maulana Pasha </p>
<p align = "center"> NIM  : 2341720107 </p>
<p align = "center"> Prodi: TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas: 1B </p>
<br><br><br><br><br>

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
<br><br><br><br>

## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

![alt text](image-2.png)
<br>

## Pertanyaan

1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan?<br>
Jawab : baris kode program yang digunakan untuk proses instansiasi objek bk1 dari class Buku: Buku bk1 = new Buku();<br>
Object yang dihasilkan bernama "bk1".
2. Bagaimana cara mengakses atribut dan method dari suatu objek?<br>
Jawab : dengan menggunakan nama objek diikuti dengan tanda titik (.) dan diikuti dengan nama atribut atau nama method yang ingin diakses.
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?<br>
Jawab : karena ada perubahan pada atribut stok dan harga sebelum pemanggilan kedua. Pada pemanggilan pertama, atribut stok memiliki nilai 13 dan atribut harga memiliki nilai 71000. Setelah pemanggilan terjual(5) dan gantiHarga(60000), nilai atribut stok menjadi 8 dan nilai atribut harga menjadi 60000, sehingga output dari pemanggilan kedua mencerminkan perubahan tersebut.