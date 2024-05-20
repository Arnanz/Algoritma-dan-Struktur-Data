package Pertemuanke11.tugas1;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 singLL = new SingleLinkedList02();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.addLast(115, "Sari ");
        singLL.print();
        singLL.insertAfter(111, "Anton", 112, "Prita");
        singLL.print();
        singLL.insertAt(2, 113, "Yusuf");
        singLL.print();
    }
}
