package section3;

public class InsertFirstLinkedList {

    public static void main(String args[]){
        int[] data = {3, 6, 1, 10};

        SinglyLinkedList<Object> list = new SinglyLinkedList<>();
        
        System.out.println("\nBefore insertion:");
        
        if (list.isEmpty()) // check for empty list
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");

        list.addFirst(data[0]);

        System.out.println("\nAfter insertion:");

        if (list.isEmpty()) // verify successful insertion
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");


    }
}
