import java.util.Scanner;

public class ArrayObjects02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah persegi panjang: ");
        int length = sc.nextInt();

        PersegiPanjang02[] ppArray = new PersegiPanjang02[length];

        for (int i = 0; i < length; i++) {
            ppArray[i] = new PersegiPanjang02();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}