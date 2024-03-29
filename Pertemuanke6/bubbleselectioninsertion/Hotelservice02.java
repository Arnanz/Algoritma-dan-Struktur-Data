public class Hotelservice02 {
    Hotel02 hotel[] = new Hotel02[5];
    int idx;

    void tambah(Hotel02 h) {
        if (idx < hotel.length) {
            hotel[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Hotel02 h : hotel) {
            h.tampil();
            System.out.println("----------------------");
        }
    }

    public void bubbleSortHarga() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (hotel[j].harga > hotel[j + 1].harga) {
                    Hotel02 temp = hotel[j];
                    hotel[j] = hotel[j + 1];
                    hotel[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortRating() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (hotel[j].bingtang > hotel[idxMax].bingtang) {
                    idxMax = j;
                }
            }
            Hotel02 temp = hotel[idxMax];
            hotel[idxMax] = hotel[i];
            hotel[i] = temp;
        }
    }
}