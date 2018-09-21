package ch02;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Queue<Item> implements Iterable<Item> {
    private Node head; // a first node

    private class Node {
        Item item;
        Node previous;
        Node next;

        Node(Item item) {
            this.item = item;
        }
    }


    void add(Item item) {
        /* 1. allocate node
         * 2. put in the data */
        Node newNode = new Node(item);

        Node last = head; /* used in step 5 to traverse till the last node */

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        newNode.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            newNode.previous = null;
            head = newNode;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = newNode;

        /* 7. Make last node as previous of new node */
        newNode.previous = last;
    }

    Item remove() {
        if (head == null || head.item == null) {
            return null;
        }
        else {
            Item result = head.item;
            head = head.next;
            return result;
        }
    }

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node current = head;

            public boolean hasNext() {
                return current != null && current.item != null;
            }

            public Item next() {
                if (current == null || current.item == null) {
                    throw new NoSuchElementException();
                }
                else {
                    Item next = current.item;
                    current = current.next;
                    return next;
                }
            }
        };
    }
}

public class Ex16Queue {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.add("to");
        q.add("be");
        q.add("or");
        q.add("not");
        q.add("to");
        q.add("be");

        for (String s : q) System.out.println(s); // test iterator
        System.out.println("----------");

        String item;
        while ((item = q.remove()) != null) {
            System.out.println(item);
        }

        q.add("Final");
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
