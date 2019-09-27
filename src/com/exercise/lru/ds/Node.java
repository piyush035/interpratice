package com.exercise.lru.ds;

public class Node<T> {
    Node next, prev;
    T obj;

    public Node() {
    }

    public Node(final T obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
