package Stacks;

public class stackUsingLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static Node head=null;

        //  is empty
        public static boolean isEmpty(){
           return head==null;
        }



        //push
        public static void push(int data){
            Node temp=new Node(data);
            if(isEmpty()){
                head=temp;
                return ;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }


        // pop
        public static int  pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int top=head.data;
                head=head.next;
                return top;

            }
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return head.data;
            }
        }

    }

    public static void main(String[] args) {
        stack  s = new stack();
        System.out.println( "peek element "+s.peek());

        s.push(1);
        System.out.println( "peek element "+s.peek());

        s.push(2);
        System.out.println( "peek element "+s.peek());
        s.push(3);
        System.out.println( "peek element "+s.peek());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }



    }
}
