import java.util.Scanner;
public class Mainhotel02 {
    public static void main(String[] args) {
        Hotelservice02 list = new Hotelservice02();
        Hotel02 h1 = new Hotel02("Hotel A", "Jakarta", 200000, (byte) 3);
        Hotel02 h2 = new Hotel02("Hotel B", "Bandung", 150000, (byte) 4);
        Hotel02 h3 = new Hotel02("Hotel C", "Malang", 300000, (byte) 5);
        Hotel02 h4 = new Hotel02("Hotel D", "Surabaya", 180000, (byte) 2);
        Hotel02 h5 = new Hotel02("Hotel E", "Semarang", 250000, (byte) 1);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum sorting : ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting asc berdasarkan Harga");
        list.bubbleSortHarga();
        list.tampil();

        System.out.println("Data Hotel setelah sorting desc berdasarkan Bintang");
        list.selectionSortRating();
        list.tampil();
    }
}