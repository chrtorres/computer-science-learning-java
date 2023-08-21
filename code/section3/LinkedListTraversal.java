package section3;

public class LinkedListTraversal {

    public static <E> void traverseRecursive(SinglyLinkedList.Node<E> c){
        // Base case: current = null
        if (c == null)
            return;
        System.out.println(c.getElement()); // print current element 
        traverseRecursive(c.getNext()); // recursive traversal
    }
    public static void main(String args[]) {
        int[] data = { 3, 6, 1, 10 }; // data to insert into LinkedList

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(); // LinkedList instantiation

        System.out.println("\nBefore insertion:");
        
        if (list.isEmpty()) // check for empty list
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");

        for (int i: data)
            list.addFirst(i);

        System.out.println("\nAfter insertion:");

        if (list.isEmpty()) // verify successful insertion
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");

        SinglyLinkedList.Node<Integer> current = list.getHead(); // get the head of the list

        // traverse the list using loops
        System.out.println("\nTraversal using While loop:");
        while (current != null) {

            Integer element = current.getElement(); // return element of current Node

            System.out.println(element);
            current = current.getNext(); // update to next Node
        }

        // traverse the list recursively
        System.out.println("\nTraversal using recursion:");
        traverseRecursive(list.getHead());
        

    }
}
