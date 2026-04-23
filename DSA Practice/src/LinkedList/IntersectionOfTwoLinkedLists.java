package LinkedList;

public class IntersectionOfTwoLinkedLists {
    static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node getIntersection(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node p1 = headA, p2 = headB;
        while(p1 != p2){
            p1 =(p1==null) ?  headB : p1.next;
            p2 =(p2==null) ?  headA : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);

        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = common;

        Node head2 = new Node(4);
        head2.next = common;

        Node result = getIntersection(head1, head2);

        if (result != null)
            System.out.println("Intersection at node: " + result.data);
        else
            System.out.println("No intersection");
    }
}
