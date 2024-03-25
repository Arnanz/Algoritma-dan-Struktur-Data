import java.util.Scanner;
public class main02 {
    public static void main(String[] args) {
        DaftarmahasiswaBerprestasi02 list = new DaftarmahasiswaBerprestasi02();
        Mahasiswa02 m1 = new Mahasiswa02("Nusa",2017,25,3);
        Mahasiswa02 m2 = new Mahasiswa02("Rara",2012,19,4);
        Mahasiswa02 m3 = new Mahasiswa02("Dompu",2018,19,3.5);
        Mahasiswa02 m4 = new Mahasiswa02("Abdul",2017,23,2);
        Mahasiswa02 m5 = new Mahasiswa02("Ummi",2019,21,3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan IPK");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
}
