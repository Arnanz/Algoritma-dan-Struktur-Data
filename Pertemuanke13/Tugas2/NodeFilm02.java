package Pertemuanke13.Tugas2;

public class NodeFilm02 {
    int id;
    String judul;
    double rating;
    NodeFilm02 next;
    NodeFilm02 prev;

    public NodeFilm02(NodeFilm02 prev, int id, String judul, double rating, NodeFilm02 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
