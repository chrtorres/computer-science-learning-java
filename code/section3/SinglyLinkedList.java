package section3;

/*
 * In order to create a Singly linked list, we must have certain methods:
 * 
 * -size( ): Returns the number of elements in the list.
 * -isEmpty( ): Returns true if the list is empty, and false otherwise.
 * -first( ): Returns (but does not remove) the first element in the list.
 * -last( ): Returns (but does not remove) the last element in the list.
 * -addFirst(e): Adds a new element to the front of the list.
 * -addLast(e): Adds a new element to the end of the list.
 * -removeFirst( ): Removes and returns the first element of the list.
 *
 */
public class SinglyLinkedList<E> {

    public static class Node<E> {
        private E element;
        private Node<E> next;

        // Constructor
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        // Returns data in Node
        public E getElement() {
            return element;
        }

        // Returns reference to next Node
        public Node<E> getNext() {
            return next;
        }

        // Set reference to next Node
        public void setNext(Node<E> n){
            next = n;
        }
    }

    private Node<E> head = null;    // head node of the list (null if empty)
    private Node<E> tail = null;    // last node of the list (null if empty)
    private int size = 0;   // number of nodes in the list
    // Constructor for an empty list
    public SinglyLinkedList(){}
    // access methods
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    // returns (but does not remove) the last element
    public E first(){
        if (isEmpty()) 
        return null;
        return tail.getElement();
    }
    // update methods
    public void addFirst(E e) {         // adds element to the front of the list
        head = new Node<>(e, head);     // create and link a new node
        if (size == 0)                  
            tail = head;                // special case: new node becomes tail also
        size++;
    }

    public void addLast(E e){           // adds element to the end of the list
        Node<E> newest = new Node<>(e, null);    // node will eventually be the tail
        if (isEmpty())
            head = newest;              // special case: previously empty list
        else 
            tail.setNext(newest);       // new node after existing tail
        tail = newest;                  // new node becomes the tail 
        size++;
    
    }

    public E removeFirst(){
        if (isEmpty())
            return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size ==0)
            tail = null;
        return answer;
    }
}
    

