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

# 4.2 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
Class<br>
```java
public class Faktorial02 {
    public int nilai;
int faktorialBF(int n){
    int fakto =1;
    for(int i=1; i <=n; i++){
        fakto = fakto * i;
    }
    return fakto;
}
int faktorialDC(int n){
    if(n==1){
        return 1;
    }
    else{
        int fakto = n * faktorialDC(n-1);
        return fakto;
        }
    }
}
```
main<br>
```java
import java.util.Scanner;

public class MainFaktorial02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial02[] fk20 = new Faktorial02[10];
        for (int i = 0; i < iJml; i++) {
            fk20[i] = new Faktorial02();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            fk20[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out
                    .println("Hasil perhitungan menggunakan Brute Force adalah " + fk20[i].faktorialBF(fk20[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil perhitungan menggunakan Divide and Conquer adalah " + fk20[i].faktorialDC(fk20[i].nilai));
        }
    }
}
```
Output<br>
![alt text](image.png)



## Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!<br>
Jawab : Pada algoritma divide conquer untuk mencari nilai faktorial, perbedaan dalam penggunaan if dan else terletak pada pembagian tugas antara bagian rekursif dan bagian basis dari algoritma.
Pada bagian if, kita menentukan kondisi basis (base case) di mana rekursi berhenti. Jika kondisi ini tercapai, maka hasil basis langsung dikembalikan.
Pada bagian else, kita menentukan bagaimana rekursi berlanjut. Jika kondisi basis tidak terpenuhi, maka dilakukan pemanggilan rekursif untuk memecah masalah menjadi submasalah yang lebih kecil hingga mencapai kondisi basis.
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!<br>
Jawab : Iya, memungkinkan untuk merubah perulangan pada method faktorialBF() selain menggunakan for. Kita bisa menggunakan perulangan while atau do-while untuk menggantikan perulangan for.<br>
```java
public int faktorialBF(int n) {
    int result = 1;
    int i = 1;
    while (i <= n) {
        result *= i;
        i++;
    }
    return result;
}
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !<br>
Jawab : fakto *= i; merupakan operasi penugasan gabungan (compound assignment) yang mengalikan fakto dengan nilai i dan kemudian menyimpan hasilnya kembali ke fakto. Ini digunakan dalam pendekatan brute force untuk menghitung faktorial dengan menggunakan perulangan.<br>
int fakto = n * faktorialDC(n-1); merupakan pendekatan rekursif untuk menghitung faktorial dengan menggunakan algoritma divide and conquer. Pada pendekatan ini, kita mengalikan n dengan hasil rekursif dari faktorialDC(n-1), yang secara rekursif menghitung faktorial dari n-1 hingga mencapai kondisi basis.<br>
# 4.3 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
class<br>
```java
public class Pangkat02 {
    public int nilai,Pangkat02;
        int pangkatBF(int a, int n){
            int hasil = 1;
            for(int i = 0; i < n; i++){
                hasil *= a;
            }
            return hasil ;
        }
        int pangkatDC(int a, int n){
            if(n == 0){
                return 1;
            }
            else{
                if(n%2 == 1){
                    return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
                }
                else{
                    return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
                }
            }
        }
    }


```
main<br>
```java
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        Pangkat02[] png02 = new Pangkat02[elemen];
        for(int i=0; i<elemen; i++){
            png02[i] = new Pangkat02();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png02[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            png02[i].Pangkat02 = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil dari "+png02[i].nilai+"Pangkat"+png02[i].Pangkat02+"adalah"+png02[i].pangkatBF(png02[i].nilai, png02[i].Pangkat02));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil dari "+ png02[i].nilai+"Pangkat"+png02[i].Pangkat02+"adalah"+png02[i].pangkatDC(png02[i].nilai, png02[i].Pangkat02));
        }
    }
}
```
Output<br>
![alt text](image-1.png)

## Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br>
Jawab :
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>
Jawab :
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.<br>
Jawab :
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case<br>
Jawab :


# 4.4 : Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
class
```java
public class Sum02 {
    int elemen;
    double keuntungan[], total;

    Sum02(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
    double totalBF(double arr[]){
        for(int i=0; i<elemen; i++){
            total = total + arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l == r){
            return arr[l];
        }else if(l < r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-l);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum;
        }
        return 0;
    }
}
```
main
```java
import java.util.Scanner;
public class Mainsum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------------");
    System.out.println("ProgramMenghitung Keuntungan Total (Satuan Juta.Misal 5.9)");
    System.out.println("Masukkan jumlah bulan : ");
    int elm = sc.nextInt();
    Sum02 sm = new Sum02(elm);
    System.out.println("---------------------------------");
    for (int i = 0; i < sm.elemen; i++) {
        System.out.println("Masukkan untung bulan ke-" + (i + 1) + " = ");
        sm.keuntungan[i] = sc.nextDouble();
    }
    System.out.println("---------------------------------");
    System.out.println("Algoritma Brute Force");
    System.out.println("Total Keuntungan perusahaan selama" + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
    System.out.println("---------------------------------");
    System.out.println("Algoritma Divide and Conquer");
    System.out.println("Total Keuntungan perusahaan selama" + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
}
}
```
Output<br>

## Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan<br>
Jawab :
2. Kenapa dibutuhkan variable mid pada method TotalDC()?<br>
Jawab :
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!<br>
Jawab :

# 4.5 : Latihan Praktikum
1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini
merk tipe tahun top_acceleration top_power
BMW M2 Coupe 2016 6816 728
Ford Fiesta ST 2014 3921 575
Nissan 370Z 2009 4360 657
Subaru BRZ 2014 4058 609
Subaru Impreza WRX STI 2013 6255 703
Toyota AE86 Trueno 1986 3700 553
Toyota 86/GT86 2014 4180 609
Volkswagen Golf GTI 2014 4180 631
Tentukan:
a) top_acceleration tertinggi menggunakan Divide and Conquer!
b) top_acceleration terendah menggunakan Divide and Conquer!
c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force