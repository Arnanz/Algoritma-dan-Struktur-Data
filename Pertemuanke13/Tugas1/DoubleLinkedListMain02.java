package Pertemuanke13.Tugas1;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void menu() {
        System.out.println("========================================");
        System.out.println("     PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("========================================");
        System.out.println("1. Tambahkan Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("========================================");
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc10 = new Scanner(System.in)) {
            DoubleLinkedList02 dll = new DoubleLinkedList02();

            int pilih;
            do {
                menu();
                pilih = sc10.nextInt();
                sc10.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("    Masukkan Data Penerima Vaksin");
                        System.out.println("---------------------------------------");
                        System.out.println("Nomor Antrian\t\t: ");
                        int nim = sc10.nextInt();
                        System.out.println("Nama Penerima Vaksin\t: ");
                        String nama = sc10.next();
                        dll.addLast(nim, nama);
                        sc10.nextLine();
                        dll.printQueue();
                        break;

                    case 2:
                        dll.Dequeue();
                        // dll.printQueue();

                    case 3:
                        dll.printQueue();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        }
    }
}
