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