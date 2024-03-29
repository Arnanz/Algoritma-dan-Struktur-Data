package Latihan2;
import java.util.Scanner;
public class InformasiMahasiswa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa02[] mahasiswa = new Mahasiswa02[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            mahasiswa[i] = new Mahasiswa02(nama, nim, jenisKelamin, ipk);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK: " + mahasiswa[i].ipk);
        }
        System.out.println();
        double rataIPK = Mahasiswa02.hitungRataIPK(mahasiswa);
        System.out.println("Rata-rata IPK: " + rataIPK);
        System.out.println();
        Mahasiswa02 terbaik = Mahasiswa02.mahasiswaTerbaik(mahasiswa);
        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + terbaik.nama);
        System.out.println("NIM: " + terbaik.nim);
        System.out.println("Jenis Kelamin: " + terbaik.jenisKelamin);
        System.out.println("IPK: " + terbaik.ipk);
    }
}