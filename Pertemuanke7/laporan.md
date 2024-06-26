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

# Percobaan 1 : Langkah-langkah Percobaan Sequential Search
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
```java
package Pertemuanke7.TestSearching;
public class Buku02 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    public Buku02(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void tampilDataBuku() {
        System.out.println("================================================");
        System.out.println("Kode buku: " + kodeBuku);
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}
```
```java
package Pertemuanke7.TestSearching;

public class PencarianBuku02 {
    Buku02 listBk[] = new Buku02[5];
    int idx;

void tambah(Buku02 m) {
    if(idx < listBk.length) {
        listBk[idx] = m;
        idx++;
} else {
        System.out.println("Data sudah penuh");
    }
}
void tampil() {
    for (Buku02 m : listBk) {
        m.tampilDataBuku();
}
}
public int FindSeqSearch(int cari) {
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku == cari) {
            posisi = j;
            break;
}
}
return posisi;
}
public void Tampilposisi(int x, int pos) {
    if (pos!= -1) {
        System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
} else {
        System.out.println("Data : " + x + " tidak ditemukan");
}
}
}
```
```java
package Pertemuanke7.TestSearching;
import java.util.ArrayList;
import java.util.Scanner;

public class Bukumain02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 5;
        System.out.println("================================================");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("================================================");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("================================================");
        System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("================================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari,posisi);
    }
}
```
Output<br>
![alt text](img/image.png)<br>
![!\[alt text\](img/image1.png)](img/image1.png)<br>
Buatlah method TampilData bertipe void pada class PencarianBukuNoAbsen dan
tambahkan isi dari method TampilData.<br>
```java
public void TampilData(int x, int pos) {
    if(pos!= -1) {
        System.out.println("Kode Buku\t : "+ x);
        System.out.println("Judul\t\t : "+listBk[pos].judulBuku);
        System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
        System.out.println("Pengarang\t : "+listBk[pos].pengarang);
        System.out.println("Stock\t\t : "+listBk[pos].stock);
}else {
    System.out.println("data "+ x + "tidak ditemukan");
}
}
```
Di dalam method main(), Lakukan pemanggilan method TampilData dari class
PencarianMhs.
```java
 data.TampilData(cari, posisi);
 ```
 Output<br>
![!\[alt text\](image.png)](img/image2.png)<br>
![!\[alt text\](image.png)](img/image3.png)<br>
## Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!<br>
Jawab : digunakan untuk menghentikan loop for ketika data yang dicari telah ditemukan.
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
Jawab : dapat berjalan dengan hasil yang dikeluarkan juga benar, karena datanya masih sedikit.Jika datanya banyak mungkin akan tidak akurat.<br>
![alt text](img/image4.png)<br>
![!\[alt text\](image.png)](img/image5.png)
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :!
```java
Buku02 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();
```
Jawab : dengan menambahkan kode ini pada class PencarianBuku02
```java
public Buku02 FindBuku(int cari) {
    Buku02 buku = null;
    for (int j = 0; j < listBk.length; j++) {
       if (listBk[j].kodeBuku == cari) {  
            buku = listBk[j];
            break;
        }
    }
    return buku;
}
```
# Percobaan 2 : Langkah-langkah Percobaan Binary Search
tambahkan kode program dibawah ini pada class PencarianBuku02
```java
public int FindBinarySearch(int cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (right) /2;
        if (cari == listBk[mid].kodeBuku) {
            return(mid);
        } else if (listBk[mid].kodeBuku > cari) {
            return FindBinarySearch(cari, left, mid);
        } else {
            return FindBinarySearch(cari, left, right);
        }
    }
    return -1;
}
```
Panggil method FindBinarySearch di kelas BukuMainNoAbsen dengan menambahkan kode dibawah ini
```java
System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari,0,jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
```
Output<br>
![!\[alt text\](image.png)](img/image6.png)<br>
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
![!\[alt text\](<Screenshot 2024-03-27 135417.png>)](img/image7.png)

## Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!<br>
jawab: proses divide dijalankan ketika menghitung nilai tengah (mid) dari pencarian menggunakan operasi (left + right) / 2. Operasi ini membagi pencarian menjadi dua bagian.

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!<br>
jawab: dalam metode Find BinarySearch
```java
public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid);
            } else {
                return FindBinarySearch(cari, mid, right);
            }
        }
        return -1;
    }
```
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
jawab: program akan berjalan karena metode pencarian sequen dapat menangani pencarian dalam data yang tidak diurutkan, sementara untuk hasil pencarian biner mungkin tidak akurat jika data tidak diurutkan.<br>
![alt text](img/image8.png)
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!<br>
Jawab : Ini adalah Modifikasi Programnya
```java
public int FindBinarySearch(int cari, int left, int right) {
 if (right >= left) {
     int mid = left + (right - left) / 2;
     if (listBk[mid].kodeBuku == cari) {
         return mid;
     } else if (listBk[mid].kodeBuku < cari) {
         return FindBinarySearch(cari, left, mid - 1);
     } else {
         return FindBinarySearch(cari, mid + 1, right);
     }
 }
 return -1;
}
```
Output<br>
![!\[alt text\](image.png)](img/image9.png)

## Percobaan 3
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
```java
package Pertemuanke7.TestSearching.MergeSortTest;

public class MergeSorting02 {
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int[] data, int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] < temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
```java
package Pertemuanke7.TestSearching.MergeSortTest;

public class MergeSortingMain02 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");
        MergeSorting02 mSort = new MergeSorting02();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
```
Output<br>
![!\[alt text\](image.png)](img/image10.png)
## Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini:<br>
- Ubah tipe data dari kode Buku yang awalnya int menjadi String<br>
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search.<br>
jawab:<br>
```java
package Pertemuanke7.TestSearching;
public class Buku02 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    public Buku02(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void tampilDataBuku() {
        System.out.println("================================================");
        System.out.println("Kode buku: " + kodeBuku);
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}
```
```java
package Pertemuanke7.TestSearching;

public class PencarianBuku02 {
    Buku02 listBk[] = new Buku02[5];
    int idx;

void tambah(Buku02 m) {
    if(idx < listBk.length) {
        listBk[idx] = m;
        idx++;
} else {
        System.out.println("Data sudah penuh");
    }
}
void tampil() {
    for (Buku02 m : listBk) {
        m.tampilDataBuku();
}
}
public int FindSeqSearch(int cari) {
    int posisi = 2;
    for (int j = 0; j < listBk.length; j++) {
        if (Integer.parseInt(listBk[j].kodeBuku) == cari) {
            posisi = j;
            break;
}
}
return posisi;
}
public void Tampilposisi(int x, int pos) {
    if (pos!= -1) {
        System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
} else {
        System.out.println("Data : " + x + " tidak ditemukan");
}
}
public void TampilData(int x, int pos) {
    if(pos!= -1) {
        System.out.println("Kode Buku\t : "+ listBk[pos].kodeBuku);
        System.out.println("Judul\t\t : "+listBk[pos].judulBuku);
        System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
        System.out.println("Pengarang\t : "+listBk[pos].pengarang);
        System.out.println("Stock\t\t : "+listBk[pos].stock);
}else {
    System.out.println("data "+ x + "tidak ditemukan");
}
}
public Buku02 FindBuku(int cari) {
    Buku02 buku = null;
    for (int j = 0; j < listBk.length; j++) {
       if (Integer.parseInt(listBk[j].kodeBuku) == cari) {  
            buku = listBk[j];
            break;
        }
    }
    return buku;
}
public int FindBinarySearch(int cari, int left, int right) {
    bubbleSortBuku();
    if (right >= left) {
        int mid = left + (right - left) / 2;
        if (Integer.parseInt(listBk[mid].kodeBuku) == cari) {
            return mid;
        } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
            return FindBinarySearch(cari, left, mid - 1);
        } else {
            return FindBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
   }
   void bubbleSortBuku() {
    for (int i = 0; i < listBk.length - 1; i++) {
        for (int j = 1; j < listBk.length - i; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku) < Integer.parseInt(listBk[j - 1].kodeBuku)) {
                Buku02 tmp = listBk[j];
                listBk[j] = listBk[j - 1];
                listBk[j - 1] = tmp;
            }
        }
    }
}
}
```
```java
package Pertemuanke7.TestSearching;
import java.util.ArrayList;
import java.util.Scanner;

public class Bukumain02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 5;
        System.out.println("=======================================================");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=======================================================");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("================================================");
        System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("================================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari,posisi);
        data.TampilData(cari, posisi);
        Buku02 dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
        dataBuku.tampilDataBuku();
        } else {
        System.out.println("Buku dengan kode " + cari + " tidak ditemukan");
        System.out.println("================================================");
        System.out.println("menggunakan binary search");
        data.bubbleSortBuku();
        posisi = data.FindBinarySearch(cari,0,jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
}
```
Output<br>
![!\[alt text\](<Screenshot 2024-04-02 082548.png>)](img/image11.png)
![!\[alt text\](<Screenshot 2024-04-02 082603.png>)](img/image12.png)
![!\[alt text\](image.png)](img/image13.png)<br>
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini:<br>
-Tambahkan method pencarian judul buku menggunakan sequential search dan binary search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga ketika input data acak, maka algoritma searching akan tetap berjalan<br>
-Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!
jawab:<br>
```java
package Pertemuanke7.TestSearching;

public class PencarianBuku02 {
    Buku02 listBk[] = new Buku02[5];
    int idx;

void tambah(Buku02 m) {
    if(idx < listBk.length) {
        listBk[idx] = m;
        idx++;
} else {
        System.out.println("Data sudah penuh");
    }
}
void tampil() {
    for (Buku02 m : listBk) {
        m.tampilDataBuku();
}
}
public int FindSeqSearchbyKodeBuku(int cari) {
    int posisi = 2;
    for (int j = 0; j < listBk.length; j++) {
        if (Integer.parseInt(listBk[j].kodeBuku) == cari) {
            posisi = j;
            break;
        }
    }
    return posisi;
}
public void TampilposisiByKodeBuku(int x, int pos) {
    if (pos != -1) {
        System.out.println("data : " + x + " ditemukan pada indeks " + pos);
    } else {
        System.out.println("data : " + x + " tidak ditemukan");
    }
}
public void TampilDataByKodeBuku(int x, int pos) {
    if (pos != -1) {
        System.out.println("Kode Buku: " + listBk[pos].kodeBuku);
        System.out.println("Judul Buku: " + listBk[pos].judulBuku);
        System.out.println("Tahun Terbit: " + listBk[pos].tahunTerbit);
        System.out.println("Pengarang: " + listBk[pos].pengarang);
        System.out.println("Stock: " + listBk[pos].stock);
    } else {
        System.out.println("data : " + x + " tidak ditemukan");
    }
}

public void TampilPosisiByJudulBuku(String judul, int posisi) {
    if (posisi != -1) {
        System.out.println("Data buku dengan judul '" + judul + "' ditemukan pada indeks " + posisi);
    } else {
        System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
    }
}

public void TampilDataByJudulBuku(String judul, int posisi) {
    if (posisi != -1) {
        System.out.println("Kode Buku: " + listBk[posisi].kodeBuku);
        System.out.println("Judul Buku: " + listBk[posisi].judulBuku);
        System.out.println("Tahun Terbit: " + listBk[posisi].tahunTerbit);
        System.out.println("Pengarang: " + listBk[posisi].pengarang);
        System.out.println("Stock: " + listBk[posisi].stock);
    } else {
        System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
    }
}

public Buku02 FindBuku(int cari) {
    Buku02 buku = null;
    for (int j = 0; j < listBk.length; j++) {
        if (Integer.parseInt(listBk[j].kodeBuku) == cari) {
            buku = listBk[j];
            break;
        }
    }
    return buku;
}

public int FindBinarySearchByKodeBuku(int cari, int left, int right) {
    bubbleSortKodeBuku();
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (Integer.parseInt(listBk[mid].kodeBuku) == cari) {
            return mid;
        } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
            return FindBinarySearchByKodeBuku(cari, left, mid - 1);
        } else {
            return FindBinarySearchByKodeBuku(cari, mid + 1, right);
        }
    }
    return -1;
}

void bubbleSortKodeBuku() {
    for (int i = 0; i < listBk.length - 1; i++) {
        for (int j = 1; j < listBk.length - i; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku) < Integer.parseInt(listBk[j - 1].kodeBuku)) {
                Buku02 tmp = listBk[j];
                listBk[j] = listBk[j - 1];
                listBk[j - 1] = tmp;
            }
        }
    }
}

public int findSeqSearchByJudulBuku(String judulBuku) {
    int posisi = -1;
    int count = 0;
    for (int j = 0; j < idx; j++) {
        if (listBk[j].judulBuku.equalsIgnoreCase(judulBuku)) {
            posisi = j;
            count++;
        }
    }
    if (count > 1) {
        System.out.println("Ditemukan " + count + " buku dengan judul \"" + judulBuku + "\".");
        System.out.println("Berikut daftar kode bukunya:");
        for (int j = 0; j < idx; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(judulBuku)) {
                System.out.println("Data: " + listBk[j].kodeBuku);
            }
        }
    }

    return posisi;
}

public int findBinarySearchByJudulBuku(String judulBuku) {
    insertionSortJudulBuku();

    int left = 0;
    int right = idx - 1;
    int posisi = -1;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (listBk[mid].judulBuku.equalsIgnoreCase(judulBuku)) {
            posisi = mid;
            break;
        } else if (listBk[mid].judulBuku.compareToIgnoreCase(judulBuku) > 0) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return posisi;
}

public void insertionSortJudulBuku() {
    for (int i = 1; i < idx; i++) {
        String temp = listBk[i].judulBuku;
        int j = i - 1;
        while (j >= 0 && listBk[j].judulBuku.compareToIgnoreCase(temp) > 0) {
            listBk[j + 1] = listBk[j];
            j--;
        }
        listBk[j + 1].judulBuku = temp;
    }
}
}
```
```java
package Pertemuanke7.TestSearching;
import java.util.ArrayList;
import java.util.Scanner;

public class Bukumain02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 5;
        System.out.println("=======================================================");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=======================================================");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("================================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        
        int pilihan = 0;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("Menu Pilihan : ");
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Cari Data Buku Berdasarkan Kode Buku");
            System.out.println("2. Cari Data Buku Berdasarkan Judul Buku");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Pencarian Data : ");
                    System.out.println("Masukkan kode buku yang dicari: ");
                    System.out.print("Kode Buku : ");
                    int cari = s.nextInt();
                    System.out.println("Menggunakan sequential Search");
                    int posisi = data.FindSeqSearchbyKodeBuku(cari);
                    data.TampilposisiByKodeBuku(cari, posisi);
                    data.TampilDataByKodeBuku(cari, posisi);

                    Buku02 dataBuku = data.FindBuku(cari);
                    if (dataBuku != null) {
                        dataBuku.tampilDataBuku();
                    } else {
                        System.out.println("Buku dengan kode " + cari + " tidak ditemukan.");
                    }

                    System.out.println("=========================================================");
                    System.out.println("Menggunakan binary search");
                    data.bubbleSortKodeBuku();
                    posisi = data.FindBinarySearchByKodeBuku(cari, 0, jumBuku - 1);
                    data.TampilposisiByKodeBuku(cari, posisi);
                    data.TampilDataByKodeBuku(cari, posisi);
                    break;

                case 2:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Pencarian Data : ");
                    System.out.println("Masukkan judul buku yang dicari: ");
                    System.out.print("Judul Buku : ");
                    String cariJudul = s1.nextLine();
                    System.out.println();

                    System.out.println("Menggunakan sequential Search");
                    int posisiJudul = data.findSeqSearchByJudulBuku(cariJudul);
                    data.TampilPosisiByJudulBuku(cariJudul, posisiJudul);

                    System.out.println("=========================================================");
                    System.out.println("Menggunakan binary search");
                    data.insertionSortJudulBuku();
                    posisiJudul = data.findBinarySearchByJudulBuku(cariJudul);
                    data.TampilPosisiByJudulBuku(cariJudul, posisiJudul);
                    data.TampilDataByJudulBuku(cariJudul, posisiJudul);
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("EXIT");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilihan != 3);
    }
}
```

Output<br>
![!\[alt text\](image.png)](img/image15.png)