package section3;
/*
 * Implementation of Floyd's Tortoise and Hare Algorithm for 
 * detecting cycles in a linked list.
 * 
 * 
 */

class LinkedList<E>{

    public static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n){
            this.element = e;
            this.next = n;
        }

        public E getElement(){
            return this.element;
        }

        public Node<E> getNext(){
            return this.next;
        }

        public void setNext(Node<E> n){
            this.next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public LinkedList(){}
    
    // Access methods
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean hasCycle(){
        if (head == null || head.getNext() == null)
            return false;           // no cycle detected
        
        Node<E> tortoise = head;
        Node<E> hare = head;

        while (hare != null && hare.next != null){
            tortoise = tortoise.next;   // move tortoise one step
            hare = hare.next.next;      // move hare two steps

            if (tortoise == hare)
                return true;        // cycle detected
        }
        
        
        return false;               // no cycle detected
    }
    public void traverse(){
        Node<E> current = head;
        
        while (current != null){
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // Update methods
    public void addFirst(E data){
        head = new Node<>(data, head);
        if (size ==0)
            tail = head;
        size++;
    }
    // This method inserts a node pointing to head node for cycle creation
    public void addLast(E data){
        Node<E> newData = new Node<>(data, head); 
        if (isEmpty())
            head = newData;
        else 
            tail.next = newData;
        tail = newData;
        size++;
    }
}
public class DetectLinkedListCycle {

    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            list.addFirst(i);
        list.traverse();

        System.out.println("Cycle Detected: " + list.hasCycle());
        list.addLast(11);   // insert a new node pointing to head
        System.out.println("Node inserted...");
        System.out.println("Cycle Detected: " + list.hasCycle());
            
    }
    
}
