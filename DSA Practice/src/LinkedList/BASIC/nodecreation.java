package LinkedList.BASIC;

class LinkList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        LinkList ll = new LinkList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);

        ll.print(head);
    }
}