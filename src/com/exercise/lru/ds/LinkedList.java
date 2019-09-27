package com.exercise.lru.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> {
    public Node first, last;
    private int size = 0;

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Piyush");
        list.addLast("Piyush1");
        list.addLast("Piyush2");
        list.addLast("Piyush3");
        list.addLast("Piyush4");
        list.addLast("Piyush5");
        Iterator<String> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }

    public void addFirst(T obj) {
        Node<T> node = new Node(obj);
        if (null == first) {
            last = first = node;
        } else {
            Node node1 = first;
            first = node;
            first.next = node1;
            node1.prev = first;
        }
        size++;
    }

    public void addLast(T obj) {
        Node<T> node = new Node(obj);
        if (null == first) {
            last = first = node;
        } else {
            Node node1 = last;
            last = node;
            last.prev = node1;
            node1.next = last;
        }
        size++;
    }

    public void addLast(Node<T> node) {
        if (null == first) {
            last = first = node;
        } else {
            Node node1 = last;
            last = node;
            last.prev = node1;
            node1.next = last;
        }
        size++;
    }


    public T removeFirst() {
        if (null == first) {
            return null;
        }
        Node<T> node = first;
        first = node.next;
        first.prev = null;
        size--;
        return node.obj;
    }

    public Node<T> removeFirstNode() {
        if (null == first) {
            return null;
        }
        Node<T> node = first;
        first = node.next;
        first.prev = null;
        size--;
        return node;
    }

    public void removeNodeAndAddToLast(Node node) {
        if (node == last) {
            return;
        }
        if (first == node) {
            Node temp = first;
            first = first.next;
            temp.next = null;
            addLast(temp);
            return;
        }

        Node previ = node.prev;
        Node next1 = node.next;
        previ.next = next1;
        next1.prev = previ;
        node.next = node.prev = null;
        addLast((T) node.obj);
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return first;
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>();

    }

    public int getSize() {
        return size;
    }

    private class ListIterator<T> implements Iterator<T> {
        private Node<T> current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = current.obj;
            current = current.next;
            return item;
        }
    }
}


