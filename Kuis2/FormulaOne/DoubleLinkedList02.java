package Kuis2.FormulaOne;

public class DoubleLinkedList02 {
    Node02 head;
    Node02 tail;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public void add(String[] data) {
        Node02 newNode = new Node02(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByPoints() {
        Node02 current = head;
        while (current != null) {
            Node02 max = current;
            Node02 index = current.next;
            while (index != null) {
                if (Integer.parseInt(max.data[4]) < Integer.parseInt(index.data[4])) {
                    max = index;
                }
                index = index.next;
            }
            String[] temp = current.data;
            current.data = max.data;
            max.data = temp;
            current = current.next;
        }
    }public Node02 get(int index) {
        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void sortDriversByPoints() {
        if (head == null || head.next == null) {
            return;
        }

        Node02 current = head;
        while (current != null) {
            Node02 max = current;
            Node02 index = current.next;
            while (index != null) {
                if (Integer.parseInt(max.data[4]) < Integer.parseInt(index.data[4])) {
                    max = index;
                }
                index = index.next;
            }
            String[] temp = current.data;
            current.data = max.data;
            max.data = temp;
            current = current.next;
        }
    }

    public Node02 findByNumber(int nomorPembalap) {
        Node02 current = head;
        while (current != null) {
            if (Integer.parseInt(current.data[0]) == nomorPembalap) {
                return current;
            }
            current = current.next;
        }
        return null;
    }    
}