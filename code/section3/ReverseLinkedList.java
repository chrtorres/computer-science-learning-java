package section3;
import java.util.Scanner;
/*
 * 
 * Here we learn how to create a LinkedList, then reverse the list with 2 methods:
 * - Via loop (reverseList())
 * - Recursively (recursiveReverseList(current, prev))
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
        return (size == 0);
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
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    // Update methods
    public void addFirst(E e){
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void reverseList(){
        Node<E> currentNode = head;
        Node<E> prevNode = null;
        Node<E> nextNode = null;

        while (currentNode != null){
            nextNode = currentNode.getNext();   // store reference to next node
            currentNode.setNext(prevNode);      // set current node to point to is previous

            prevNode = currentNode;             // traverse through list by moving prev
            currentNode = nextNode;             // forward, then make current = next
        }
        head = prevNode;                        // after loop, point to new head
    }

    public void recursiveReverseList(Node<E> currentNode, Node<E> prevNode){
        if (currentNode == null){               // if we reached the end, exit recursive call
            head = prevNode;                    // make head point to tail
            return;
        }

        Node<E> nextNode = currentNode.getNext();   // store next value in list
        currentNode.setNext(prevNode);              // set original next to point to prev
        recursiveReverseList(nextNode, currentNode);    // recursive call
    }
}

public class ReverseLinkedList {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int num;

        System.out.println("Enter 5 integers to create a LinkedList:");
        while (list.size() < 5){
            num = input.nextInt();
            list.addFirst(num);

        }

        System.out.println("\nReversed List:");
        list.traverse();                                            // verify insertion
        list.reverseList();                                         // reverse the list
        System.out.println("\nReversed List:");
        list.traverse();                                            // verify success list reversal
        list.recursiveReverseList(list.getHead(), null);   // reverse list recursively 
        System.out.println("\nReverse list back to original:");
        list.traverse();

    }
}
