import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        Pangkat02[] png02 = new Pangkat02[elemen];
        for(int i=0; i<elemen; i++){
            png02[i] = new Pangkat02();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png02[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            png02[i].Pangkat02 = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil dari "+png02[i].nilai+"Pangkat"+png02[i].Pangkat02+"adalah"+png02[i].pangkatBF(png02[i].nilai, png02[i].Pangkat02));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil dari "+ png02[i].nilai+"Pangkat"+png02[i].Pangkat02+"adalah"+png02[i].pangkatDC(png02[i].nilai, png02[i].Pangkat02));
        }
    }
}