public class BukuMain02 {
    public static void main(String[] args) {
    
    Buku bk1 = new Buku();
    bk1.judul= "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilInformasi();
    Buku bk2 = new Buku("Self Reward","Maheera Ayesha",160,29,59000);
    bk2.terjual(11);
    bk2.tampilInformasi();
    Buku bk3 = new Buku("Algoritma","Pasha",177,27,77000);
    bk3.terjual(11);
    bk3.tampilInformasi();
}
}
