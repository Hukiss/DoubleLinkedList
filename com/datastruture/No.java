package com.datastruture;


public class No<T> {
    private T element;
    private No<T> previous;
    private No<T> next;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public No<T> getPrevious() {
        return previous;
    }

    public void setPrevious(No<T> previous) {
        this.previous = previous;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }
}
