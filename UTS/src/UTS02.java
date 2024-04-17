package UTS.src;

public class UTS02 {
    int[] data; 
    int idx;
    void tampil() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    void selectionSortAscending() {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
    void selectionSortDescending() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }
    public int unsortedBinarySearch(int cari) {
        return unsortedBinarySearch(cari, 0, data.length - 1);
    }
    public int unsortedBinarySearch(int cari, int kiri, int kanan) { // Changed left to kiri and right to kanan
        if (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2; // Changed mid to tengah

            if (data[tengah] == cari) {
                return tengah;
            }

            int leftResult = unsortedBinarySearch(cari, kiri, tengah - 1);
            if (leftResult != -1) {
                return leftResult;
            }

            int rightResult = unsortedBinarySearch(cari, tengah + 1, kanan);
            if (rightResult != -1) {
                return rightResult;
            }
        }
        return -1;
    }
    public int binSearchAscending(int cari, int kiri, int kanan) {
        selectionSortAscending();
        if (kanan >= kiri) {
            int tengah = (kiri + kanan) / 2;
            if (cari == data[tengah]) {
                return tengah;
            } else if (cari < data[tengah]) {
                return binSearchAscending(cari, kiri, tengah - 1);
            } else {
                return binSearchAscending(cari, tengah + 1, kanan);
            }
        }
        return -1;
    }
    public int binSearchDescending(int cari, int kiri, int kanan) {
        selectionSortDescending();
        if (kanan >= kiri) {
            int tengah = (kiri + kanan) / 2;
            if (cari == data[tengah]) {
                return tengah;
            } else if (cari > data[tengah]) {
                return binSearchDescending(cari, kiri, tengah - 1);
            } else {
                return binSearchDescending(cari, tengah + 1, kanan);
            }
        }
        return -1;
    }
}
