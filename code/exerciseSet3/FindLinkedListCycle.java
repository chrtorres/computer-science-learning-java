package exerciseSet3;
/*
 * -Modify the hasCycle function from DetectLinkedListCycle.java to return the 
 *  starting node of the cycle if one is found. If there's no cycle, return null.
 * 
 * -Write a Java program that creates a linked list with a cycle and uses the
 *  hasCycle function to detect and print the starting node of the cycle.
 * 
 * -Implement a function to remove the cycle from a linked list if one is found.
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
    public boolean isEmpty(){
        return (this.size == 0);
    }
    
    public int size(){
        return this.size;
    }

    public Node<E> getHead(){
        return this.head;
    }

    public void traverse(){
        Node<E> current = head;

        while (current != null){

            System.out.print(current.element + " -> ");
            current = current.next;
        }
        
        System.out.println("null");
    }

    public boolean hasCycle(){
        if (head == null || head.getNext() == null)
            return false;

        Node<E> slow = head;
        Node<E> fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }


        return false;
    }
    // Update modifiers
    public void addFirst(E data){
        head = new Node<>(data, head);
        if (size ==0)
            tail = head;
        size++;
    }

    public void addCycleLast(E data){
        Node<E> newNode = new Node<>(data, head);
        
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    
    public void hasCycleAndRemove(){
        if (head == null || head.getNext() == null)
            return;


        Node<E> slow = head;
        Node<E> fast = head;

         while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head;
                while ( slow != fast){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                removeCycle(slow);
            }
        }       
    }

    public void removeCycle(Node<E> cycleStartNode){
        Node<E> current = head;

        while (current.next != cycleStartNode){
            current = current.next;
        }
        current.next = null;
    }
}
public class FindLinkedListCycle {
    
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++)
            list.addFirst(i);
        
        list.traverse();
        System.out.println("Cycle detection result: " + list.hasCycle());
        list.addCycleLast(1);
        System.out.println("Cycle created... Testing for cycle");
        System.out.println("Cycle detection result: " + list.hasCycle());
        list.hasCycleAndRemove();
        System.out.println("Cycle removed... Testing for cycle");
        System.out.println("Cycle detection result: " + list.hasCycle());       

    }
}
