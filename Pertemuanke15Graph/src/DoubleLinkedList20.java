package Pertemuanke15Graph.src;
public class DoubleLinkedList20 {
    Node02 head;
    int size;

    public DoubleLinkedList20() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node02(null, item, jarak, null);
        } else {
            Node02 newNode20 = new Node02(null, item, jarak, head);
            head.prev = newNode20;
            head = newNode20;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node02 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    public void setJarak(int index, int jarakBaru) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node02 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.jarak = jarakBaru;
    }

    public void remove(int index) {
        Node02 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev == null) { 
                    head = current.next; 
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node02 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}