package section3;

/*
 * Here we will implement our own SinglyLinkedList from scratch within this class.
 * Once the logic is created we can handle insertion, deletion, and resizing of the list.
 * 
 * ***** Code Still In Progress *********
 * 
 * 
 */
public class DeleteFromList {

    public static class LinkedList<E> {
    
        public static class Node<E> {
            private E element;
            private Node<E> next;

            // constructor
            public Node(E e, Node<E> n){
                element = e;
                next = n;
            }
            // access the element of a node
            public E getElement() {
                return element;
            }

            // access reference to the next node
            public Node<E> getNext() {
                return next;
            }

            // set the reference to the next node
            public void setNext(Node<E> n) {
                next = n;
            }

        }

        private Node<E> head = null;
        private Node<E> tail = null;
        private int size = 0;

        // constructor for an empty list
        public LinkedList(){}
        
        // access methods
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        // returns (but does not remove) the first element
        public E first() {
            if (isEmpty())
                return null;
            return head.getElement();
        }

        // returns (but does not remove) the last element
        public E last() {
            if (isEmpty())
                return null;
            return tail.getElement();
        }
        
        public Node<E> getHead(){
            return head;
        }

        // update methods
        public void addFirst(E e){
            head = new Node<>(e, head);
            if (size == 0)  // if list is empty then head = tail
                tail = head;
            size++; // increase size of list after insertion
        }

        public void addLast(E e){
            Node<E> newest = new Node<>(e, null);
        }

    }

    public static void main(String args[]) {

    }
}
