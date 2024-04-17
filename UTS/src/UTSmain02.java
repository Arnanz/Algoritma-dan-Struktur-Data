package UTS.src;
import java.util.Scanner;
public class UTSmain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UTS02 angka = new UTS02();
        angka.data = new int[] { 5, 30, 41, 48, 50, 17, 26, 8, 50, 27, 16, 14, 8, 10, 11, 0, 14 };

        System.out.println("Data yang tersedia: ");
        angka.tampil();

        System.out.println("===================================================================");
        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();

        System.out.println("===================================================================");
        System.out.println("data sebelum diurutkan: ");
        angka.tampil();
        
        int posisi = angka.unsortedBinarySearch(cari);
        if (posisi != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks: " + posisi);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan pada data angka.");
        }
        System.out.println("===================================================================");

        angka.selectionSortAscending();
        System.out.println("data setelah diurutkan secara ascending: ");
        angka.tampil();
        angka.selectionSortAscending();
        int posisiSetelahPengurutanAscending = angka.binSearchAscending(cari, 0, angka.data.length - 1);
        if (posisiSetelahPengurutanAscending != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + (posisiSetelahPengurutanAscending)
                    + " setelah pengurutan ascending");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan pada data angka");
        }
        System.out.println("===================================================================");

        angka.selectionSortDescending();
        System.out.println("data setelah diurutkan secara descending: ");
        angka.tampil();
        angka.selectionSortDescending();
        int posisiSetelahPengurutanDescending = angka.binSearchDescending(cari, 0, angka.data.length - 1);
        if (posisiSetelahPengurutanDescending != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + (posisiSetelahPengurutanDescending)
                    + " setelah pengurutan descending");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan pada data angka");
        }
        System.out.println("===================================================================");
    }
}