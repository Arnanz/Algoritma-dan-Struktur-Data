package Pertemuanke13.Tugas1;

public class DoubleLinkedList02 {

        Node02 head, tail;
        int size;
    
        public DoubleLinkedList02() {
            head = null;
            tail = null;
            size = 0;
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        public void addLast(int no, String nama) {
            if (isEmpty()) {
                head = new Node02(no, nama);
            } else {
                Node02 current = head;
                while (current.next != null) {
                    current = current.next;
                }
                Node02 newNode10 = new Node02(no, nama);
                current.next = newNode10;
                tail = newNode10;
    
            }
            size++;
        }
    
        public void removeFirst() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (size == 0) {
                removeLast();
            } else {
                System.out.println(head.nama + " Sudah divaksin");
                head = head.next;
                head.prev = null;
                size--;
            }
        }
    
        public void removeLast() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head.next == null) {
                System.out.println(head.nama + " Sudah divaksin");
                head = null;
                tail = null;
                size--;
                return;
            }
            Node02 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    
        public void enqueue(int no, String nama) {
            // Node10 newNode10 = new Node10(no, nama);
            if (isEmpty()) {
                // head = tail = newNode10;
                addLast(no, nama);
            } else {
                Node02 newNode10 = new Node02(no, nama);
                tail.next = newNode10;
                newNode10.prev = tail;
                tail = newNode10;
            }
            size++;
        }
    
        void Dequeue() {
            if (isEmpty()) {
                System.out.println("Linked List Kosong");
            } else {
                Node02 removedNode10 = head;
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null;
                }
                size--;
                System.out.println(removedNode10.nama + " Sudah Divasksin");
            }
        }
    
        public void printQueue() {
            System.out.println("========================================");
            System.out.println("        DAFTAR PENGANTRI VAKSIN ");
            System.out.println("========================================");
            System.out.println(" | No \t | Nama " + " | ");
            if (!isEmpty()) {
                Node02 tmp = head;
                while (tmp != null) {
                    System.out.println(" | " + tmp.no + "\t | " + tmp.nama + "\t | ");
                    tmp = tmp.next;
                }
                System.out.println("Sisa Antrian " + size);
            } else {
                System.out.println("Linked List Kosong");
            }
        }
    }