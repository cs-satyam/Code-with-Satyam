package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        ArrayList<Boolean> list3 = new ArrayList();

        // operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println( "list"+list);
        //get operation
        System.out.println("get by id "+list.get(2));
        System.out.println("remove by id "+list.remove(2));
        System.out.println( "list"+list);
        System.out.println(list.set(2,3));
        System.out.println(list);
        System.out.println();
        System.out.println("reverse"+list.reversed());
    }
}
