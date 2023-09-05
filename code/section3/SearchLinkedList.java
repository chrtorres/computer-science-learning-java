package section3;
import java.util.Scanner;
/*
 * -Implement a method search(E data) in your LinkedList class that takes an element as
 *  input and returns true if the element is found in the list, and false otherwise. 
 * 
 * -Write a Java program that creates a linked list of integers, inserts some elements,
 *  and then searches for a specific element. Test your program with various elements,
 *  including elements that are and are not in the list. 
 * 
 * -Create a more advanced version of the search method that returns the index (position) 
 *  of the first occurrence of the element if found, and -1 if the element is not 
 *  in the list.
 * 
 * -Given a singly linked list, implement a method findMiddleElement() to find the
 *  middle element of the list. If there are two middle elements (in case of an even 
 *  number of elements), return the second middle element. 
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

    public LinkedList(){}               // Constructor
    
    // Access methods
    public int size(){                  // get list size
        return this.size;
    }

    public boolean isEmpty(){           // check for empty list
        return size == 0;
    }

    public Node<E> getHead(){           // get head of list
        return this.head;
    }

    public void traverse(){
        Node<E> current = head;

        while (current != null){
            System.out.print(current.element + " -> ");
            current = current.next;
        }

        System.out.print("null\n");
    }

    public boolean search(E e){
        Node<E> current = head;

        while (current != null){
            if (current.element == e)
                return true;
            current = current.next;
        }
        return false;    
    }

    public int searchIndex(E e){
        Node<E> current = head;
        int index = 0;

        while (current != null){
            if (current.element == e)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public E findMiddleElement(){
        Node<E> current = head;
        int index;
        if ( size % 2 == 0)             // check for even size
            index = size/2 + 1;
        else
            index = size/2;

        for (int i = 0; i < index; i++)     // iterate through list until middle
            current = current.getNext();
            
        return current.getElement();        // return middle element
    }

    // Update methods
    public void addFirst(E e){          // add element to front of list
        head = new Node<>(e, head);
        if (size == 0)                  // special case: if list was empty, tail = head
            tail = head;
        size++;                         // increase list size
    }

    public void addLast(E e){
        Node<E> newData = new Node<>(e, null);
        if (isEmpty())
            head = newData;
        else
            tail.next = newData;
        tail = newData;
        size++;
    }
}

public class SearchLinkedList {
    
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int num;
        for (int i = 1; i <= 10; i++)
            list.addFirst(i);

        list.traverse();                // Verify insertion

        System.out.println("Input a number to search the list for: ");
        num = input.nextInt();
        System.out.println(list.search(num));

        System.out.println("Input a number to insert into the list: ");
        num = input.nextInt();
        list.addFirst(num);             // insert new value
        System.out.println("New list: ");
        list.traverse();                // Verify insertion

        System.out.println("Input a number to search the index in the list: ");
        num = input.nextInt();
        System.out.println("Index of element: " + list.searchIndex(num));

        System.out.println("The middle element of the list is: " + list.findMiddleElement());
    
    }
}
