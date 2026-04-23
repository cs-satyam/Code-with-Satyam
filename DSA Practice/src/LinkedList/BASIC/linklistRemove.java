package LinkedList.BASIC;


class linklistRemove {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add Last (for setup)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Remove First
    public int removeFirst() {
        if (size == 0) return -1;

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    // Remove Last
    public int removeLast() {
        if (size == 0) return -1;

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // Delete Nth From End
    public void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            size--;
            return;
        }

        int i = 1;
        int idx = sz - n;
        Node prev = head;

        while (i < idx) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
    }

    // Print
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        linklistRemove ll = new linklistRemove();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        ll.deleteNthFromEnd(2);
        ll.print();
    }
}