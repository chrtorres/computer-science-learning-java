package section3;
import java.util.Scanner;
/*
 * 
 * Here we learn how to create a LinkedList, then reverse the list
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
}

public class ReverseLinkedList {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int num;

        System.out.println("Enter 10 integers to create a LinkedList:");
        while (list.size() < 10){
            num = input.nextInt();
            list.addFirst(num);

        }
        // for (int i = 0; i <= 10; i++ )
        //     list.addFirst(i);
        list.traverse();
        list.reverseList();
        System.out.println("\nReversed List:");
        list.traverse();

    }
}
