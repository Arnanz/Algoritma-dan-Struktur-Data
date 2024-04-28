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

# Praktikum 1  
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan<br>
```java
package Pertemuanke10.Praktikum1;

public class Queue02 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue02(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
    if (size == 0) {
        return true;
    } else {
        return false;
    }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Antrian kosong");
        }
    }
    public void print() {
        if (!IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
```
```java
package Pertemuanke10.Praktikum1;
import java.util.Scanner;

public class Queuemain02 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();

        Queue02 Q = new Queue02(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != -1) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```
<br>Output<br>
![!\[alt text\](image.png)](img/image.png)

## Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?<br>
Jawab : nilai awal atribut front dan rear -1 karena tanda bahwa tumpukan kosong. Ketika tumpukan kosong, indeks pertama (front) dan terakhir (rear) tidak ada, jadi kita menggunakan -1 sebagai tanda bahwa kosong.
Sementara itu, atribut size diatur sebagai 0 karena saat tumpukan pertama kali dibuat, tidak ada elemen dalam tumpukan.<br>
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
```java
 if (rear == max - 1) {
                    rear = 0;
```
Jawab : kode tersebut bertujuan untuk mengatur kembali nilai rear ke indeks awal (0) jika rear sudah mencapai batas maksimum (max - 1), sehingga elemen baru dapat dimasukkan ke dalam antrian pada indeks awal.<br>
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
```java
if (front == max - 1) {
                    front = 0;
```
Jawab : kode tersebut bertujuan untuk memeriksa apakah front sudah mencapai batas maksimum dari array data<br>
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?<br>
Jawab : karena kita ingin mulai mencetak elemen depan (terdepan) dalam antrian.Dalam metode print, kita ingin mencetak elemen-elemen dalam antrian dimulai dari elemen depan. Oleh karena itu, kita menginisialisasi i dengan front untuk memulai perulangan dari elemen terdepan. Jika menginisialisasi i dengan 0, maka akan mencetak elemen-elemen mulai dari elemen pertama, bukan elemen terdepan. Hal ini akan mengganggu logika struktur data antrian.<br>
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!<br>
```java
i = (i + 1) % max;
```
Jawab : digunakan untuk menggeser indeks i ke elemen berikutnya dalam array data secara melingkar. Dengan menggunakan operasi modulo % max, jika i mencapai indeks maksimum max, maka akan kembali ke indeks awal untuk menjaga perulangan yang kontinu dari elemen pertama hingga terakhir dalam array.<br>
6. Tunjukkan potongan kode program yang merupakan queue overflow!<br>
Jawab : Queue overflow terjadi ketika method Enqueue mencoba menambahkan elemen ke dalam antrian (queue) yang sudah penuh<br>
```java
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!<br>
Jawab :
```java
public boolean IsEmpty() {
    if (size == 0) {
        System.out.println("Queue underflow!");
        System.exit(0);
        return true;
    } else {
        return false;
    }
    }
    public boolean IsFull() {
        if (size == max) {
            System.out.println("Queue overflow!");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
```
Output<br>
![!\[alt text\](image.png)](img/image1.png)

# Praktikum 2  
Ini adalah SS dari kode programnya dan sesuai dengan hasil percobaan <br>
```java
package Pertemuanke10.Praktikum2;

public class Nasabah02 {
    String norek, nama, alamat;
    int umur;
    double saldo;
    Nasabah02() {
    }
    Nasabah02(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}
```
```java
package Pertemuanke10.Praktikum2;

public class Queue02 {
    Nasabah02[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue02(int n) {
        max = n;
        data = new Nasabah02[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    void enqueue(Nasabah02 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public Nasabah02 dequeue() {
        Nasabah02 dt = new Nasabah02();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " "
                        + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    void clear() {
    if (!isEmpty()) {
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    } else {
        System.out.println("Queue masih kosong");
    }
}
}
```
```java
package Pertemuanke10.Praktikum2;
import java.util.Scanner;
public class Queuemain02 {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Queue02 Q = new Queue02(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sc2.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc2.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc2.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    sc.nextLine(); // tambahkan ini
                    System.out.print("Saldo : ");
                    int saldo = sc.nextInt();
                    sc.nextLine(); // dan ini
                    Nasabah02 nb = new Nasabah02(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah02 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
```
<br>Output<br>
![!\[alt text\](image.png)](img/image2.png)

## Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!<br>
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
```
Jawab : Kode program tersebut bertujuan untuk memastikan bahwa data yang dikeluarkan dari antrian queue setelah melakukan operasi dequeue adalah data yang valid dan tidak kosong. Jika data yang dikeluarkan memenuhi kriteria validitas tersebut, maka data tersebut akan dicetak pada layar.<br>
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!<br>
Jawab :<br>
Tambahkan method baru peekRear pada class Queue
```java
void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
```
Class Main
```java
package Pertemuanke10.Praktikum2;
import java.util.Scanner;
public class Queuemain02 {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. EXIT");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Queue02 Q = new Queue02(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sc2.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc2.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc2.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    sc.nextLine(); // tambahkan ini
                    System.out.print("Saldo : ");
                    int saldo = sc.nextInt();
                    sc.nextLine(); // dan ini
                    Nasabah02 nb = new Nasabah02(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah02 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.exit(1);
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
```
<br>Output<br>
![!\[alt text\](image.png)](img/image3.png)

# Tugas
Ini adalah SS dari kode programnya<br>
```java
package Pertemuanke10.Tugas;

public class Pembeli02 {
    String nama;
    int noHP;

    Pembeli02(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
    Pembeli02() {
    }
} 
```
```java
package Pertemuanke10.Tugas;

public class Queue02 {
    Pembeli02[] antrian;
    int front;
    int rear;
    int size;
    int max;

    Queue02(int n) {
        max = n;
        antrian = new Pembeli02[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Pembeli terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }
    void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Pembeli paling belakang : " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    void peekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pembeli yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pembeli yang anda cari tidak ada");
        }
    }
    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(Pembeli02 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }
    public Pembeli02 Dequeue() {
        Pembeli02 dt = new Pembeli02();
        if (IsEmpty()) {
            System.out.println("Queue kosong");
            System.exit(0);
            ;
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
```
```java
package Pertemuanke10.Tugas;
import java.util.Scanner;
public class Queuemain02 {
    public static void menu() {
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari antrian pembeli");
        System.out.println("7. Exit");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian : ");
        int jumlah = sc.nextInt();

        Queue02 Q = new Queue02(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String nama = sc.next();
                    System.out.println("Masukkan noHp : ");
                    int noHp = sc2.nextInt();
                    Pembeli02 pembeli = new Pembeli02(nama, noHp);
                    Q.Enqueue(pembeli);
                    break;
                case 2:
                    Pembeli02 data = Q.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.daftarPembeli();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan nama Pembeli : ");
                    String cariNama = sc.next();
                    Q.peekPosition(cariNama);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (pilih != 7);
    }
}
```
Output<br>
```java
Masukkan kapasitas antrian : 4
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
1
Masukkan nama :
Adnan
Masukkan noHp :
08123
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
1
Masukkan nama :
Abdul
Masukkan noHp :
080126
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
1
Masukkan nama :
Samid
Masukkan noHp :
08234
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
1
Masukkan nama :
Sakapung
Masukkan noHp :
082356
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
2
Antrian yang dikeluarkan : Adnan 8123
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
3
Pembeli terdepan: Abdul 80126
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
4
Abdul 80126
Samid 8234
Sakapung 82356
Jumlah elemen = 3
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
5
Pembeli paling belakang : Sakapung 82356
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
6
Masukkan nama Pembeli :
Samid
Pembeli yang anda cari berada pada posisi ke 3
1. Antrian baru
2. Antrian keluar
3. Cek antrian terdepan
4. Cek semua antrian
5. Cek antrian belakang
6. Cari antrian pembeli
7. Exit
-----------------------
```