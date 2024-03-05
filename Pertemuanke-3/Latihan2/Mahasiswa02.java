package Latihan2;

public class Mahasiswa02 {
    public String nama, nim, jenisKelamin;
    public double ipk;

    public Mahasiswa02(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    public static double hitungRataIPK(Mahasiswa02[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa02 mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }
    public static Mahasiswa02 mahasiswaTerbaik(Mahasiswa02[] mhs) {
        Mahasiswa02 terbaik = mhs[0];
        for (Mahasiswa02 mahasiswa : mhs) {
            if (mahasiswa.ipk > terbaik.ipk) {
                terbaik = mahasiswa;
            }
        }
        return terbaik;
    }
}