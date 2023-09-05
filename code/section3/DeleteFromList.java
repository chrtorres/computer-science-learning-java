package section3;

/*
 * Here we will implement our own SinglyLinkedList from scratch within this class.
 * Once the logic is created we can handle insertion, deletion, and resizing of the list.
 * 
 * 
 * 
 */
public class DeleteFromList {

    public static class LinkedList<E> {

        public static class Node<E> {
            private E element;
            private Node<E> next;

            // constructor
            public Node(E e, Node<E> n) {
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
        public LinkedList() {
        }

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

        public Node<E> getHead() {
            return head;
        }

        // update methods
        public void addFirst(E e) {
            head = new Node<>(e, head);
            if (size == 0)              // if list is empty then head = tail
                tail = head;
            size++;                     // increase size of list after insertion
        }

        public void addLast(E e) {      // add element at end of list
            Node<E> newest = new Node<>(e, null);
            if (isEmpty())
                head = newest;          // if list is empty, set head = to inserted node
            else
                tail.setNext(newest);   // new node after existing tail
            tail = newest;              // if list not empty, make tail = inserted node
            size++;
        }

        public E removeFirst() {
            if (isEmpty())
                return null;
            E answer = head.getElement();
            head = head.getNext();
            size--;
            if (size == 0)
                tail = null;
            return answer;
        }

        public void traverse() {
            Node<E> current = head;

            while (current != null) {
                System.out.print(current.element + " -> ");
                current = current.next;
            }
            System.out.print("null\n");
        }

        public void delete(E e){    // delete first instance of an element
            Node<E> currentNode = head;
            Node<E> prevNode = null;
    
            while (currentNode != null){
                if (currentNode.element.equals(e)){
                    if (prevNode == null)
                        head = currentNode.next;
                    else
                        prevNode.next = currentNode.next;
    
                    if (currentNode == tail)
                        tail = prevNode;
                    size--;
                    currentNode = null;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
    
            }
    
        }
        public void deleteAll(E data) {     // delete all instances of an element
            Node<E> currentNode = head;
            Node<E> prevNode = null;

            while (currentNode != null) {       // check if empty or if we reached end of list
                if (currentNode.element == data) {
                    if (prevNode == null)
                        head = currentNode.next;// if node to be deleted is head, set head = next

                    else
                        prevNode.next = currentNode.next;   // if not head, point to next node
                    
                    if (currentNode ==  tail)
                        tail = prevNode;        // if node to delete is tail, set new tail
                    size--;                     // adjust size of list
                }
                prevNode = currentNode;         // move pointers to traverse the list
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String args[]) {

        int[] data = { 3, 6, 1, 6, 10, 6 };
        LinkedList<Integer> list = new LinkedList<>(); // create empty list

        for (int i : data)                      // insert data into list
            list.addLast(i);

        list.traverse();                        // traverse the list to verify insertion
        System.out.println("Size of List before deletion: " + list.size());

        list.delete(6);

        list.traverse();
        System.out.println("Size of List after deleting 1st instance: " + list.size());

        list.deleteAll(6);

        list.traverse();
        System.out.println("Size of List after deleting all instances: " + list.size());
    
    
    
    }
}
