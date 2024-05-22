package Kuis2.FormulaOne;

import java.util.Scanner;

public class DLLMain02 {
    static DoubleLinkedList02 dataPembalap = new DoubleLinkedList02();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initData();

        while (true) {
            System.out.println("========================");
            System.out.println("|   FORMULA ONE (F1)   |");
            System.out.println("|      Tahun 2024      |");
            System.out.println("========================");
            System.out.println("1. Lihat Klasemen");
            System.out.println("2. Update Klasemen");
            System.out.println("3. Keluar");
            System.out.println("========================");
            System.out.print("Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    lihatKlasemen();
                    break;
                case 2:
                    updateKlasemen(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void initData() {
        String[][] drivers = {
            {"44", "Lewis Hamilton", "Mercedes AMG Petronas", "Inggris", "0"},
            {"63", "George Russel", "Mercedes AMG Petronas", "Inggris", "0"},
            {"16", "Charles Leclerc", "Scuderia Ferrari", "Monako", "0"},
            {"55", "Carlos Sainz jr", "Scuderia Ferrari", "Spanyol", "0"},
            {"1", "Max Verstappen", "Oracle Red Bull Racing", "Belgia", "0"},
            {"11", "Sergio Perez", "Oracle Red Bull Racing", "Meksiko", "0"},
            {"4", "Lando Norris", "McLaren F1 Team", "Belgia", "0"},
            {"81", "Oscar Piastri", "McLaren F1 Team", "Australia", "0"},
            {"10", "Pierre Gasly", "Alpine F1 Team", "Prancis", "0"},
            {"31", "Esteban Ocon", "Alpine F1 Team", "Prancis", "0"},
            {"20", "Kevin Magnussen", "Haas F1 Team", "Denmark", "0"},
            {"27", "Nico Hulkenberg", "Haas F1 Team", "Jerman", "0"},
            {"14", "Fernando Alonso", "Aston Martin Racing", "Spanyol", "0"},
            {"18", "Lance Stroll", "Aston Martin Racing", "Kanada", "0"},
            {"3", "Daniel Ricciardo", "Visa Cash App RB", "Australia", "0"},
            {"22", "Yuki Tsunoda", "Visa Cash App RB", "Jepang", "0"},
            {"77", "Valtteri Bottas", "Stake F1 Team", "Finlandia", "0"},
            {"24", "Zhou Guanyu", "Stake F1 Team", "China", "0"},
            {"2", "Logan Sargeant", "Williams Racing", "Amerika", "0"},
            {"23", "Alex Albon", "Williams Racing", "Inggris", "0"}
        };

        for (String[] driver : drivers) {
            dataPembalap.add(driver);
        }
    }

    public static void lihatKlasemen() {
        System.out.println("=================================================================================================");
        System.out.println("|                                       Klasemen F1 2024                                        |");
        System.out.println("=================================================================================================");
        System.out.println("| Rank | No Pembalap |       Nama Pembalap       |          Tim            | Asal Negara | Poin |");
        System.out.println("|-----------------------------------------------------------------------------------------------|");
        
        dataPembalap.sortDriversByPoints();
    
        int rank = 1;
        Node02 current = dataPembalap.head;
        while (current != null) {
            System.out.printf("| %-4d | %-11s | %-25s | %-23s | %-11s |%-5s |\n", 
                rank, current.data[0], current.data[1], current.data[2], current.data[3], current.data[4]);
            rank++;
            current = current.next;
        }
    
        System.out.println("=================================================================================================");
    }
    

    public static void updateKlasemen(Scanner scanner) {
        System.out.println("==========================================");
        System.out.println("|          Update Klasemen F1            |");
        System.out.println("==========================================");
        int[] poin = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nomor pembalap untuk posisi " + (i + 1) + ": ");
            int nomorPembalap = scanner.nextInt();
            scanner.nextLine(); 
            Node02 pembalapNode = dataPembalap.findByNumber(nomorPembalap);
    
            if (pembalapNode == null) {
                System.out.println("Nomor pembalap tidak ditemukan.");
                continue;
            }
    
            pembalapNode.data[4] = String.valueOf(Integer.parseInt(pembalapNode.data[4]) + poin[i]);
        }
    
        System.out.println("Klasemen berhasil diperbarui.");
    }
}    