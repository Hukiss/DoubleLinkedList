package com.datastruture;

import com.datastruture.No;

public class DoubleLinkedList<T> {

    private No<T> begin;
    private No<T> last;
    private int size;

    public DoubleLinkedList() {
        this.begin = null;
        this.last = null;
        this.size = 0;
    }

    public void insert(T element) {
        No<T> no = new No<>();
        no.setElement(element);
        no.setPrevious(null);
        no.setNext(begin);

        if (begin != null) {
            begin.setPrevious(no);
        }
        begin = no;

        if (last == null) {
            last = no;
        }

        size += 1;
    }

    public void append(T element) {
        No<T> no = new No<>();
        no.setElement(element);
        no.setNext(null);
        no.setPrevious(last);

        if (last != null) {
            last.setNext(no);
        }
        last = no;

        if (begin == null) {
            begin = no;
        }

        size += 1;
    }

    public void remove(T element) {
        No<T> current = begin;

        while (current != null) {
            if (current.getElement().equals(element)) {
                if (current.getPrevious() != null) {
                    current.getPrevious().setNext(current.getNext());
                } else {
                    begin = current.getNext();
                }

                if (current.getNext() != null) {
                    current.getNext().setPrevious(current.getPrevious());
                } else {
                    last = current.getPrevious();
                }

                size -= 1;
                return;
            }
            current = current.getNext();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {

        No<T> current = begin;
        StringBuilder builder = new StringBuilder();
        
        if (current == null) {
            builder.append("[]").toString();
        } else {
            builder.append('[').append(current.getElement());
            current = current.getNext();

            while (current != null) {
                builder.append(',').append(current.getElement());
                current = current.getNext();
            }

            if (current == null)
                builder.append(']').toString();
        }

        System.out.println(builder);
    }

    public void removeNumbersSmallerThan(T element){

        No<T> current = begin;

        if (current == null)
            this.printList();

        while (current != null){

            if (current.getElement() == element){
                this.remove(current.getElement());
            }

           current =  current.getNext();
        }
    }
}