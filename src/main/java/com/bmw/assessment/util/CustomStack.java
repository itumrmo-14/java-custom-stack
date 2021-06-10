package com.bmw.assessment.util;

import java.util.EmptyStackException;
import java.util.logging.Logger;

public class CustomStack<E> {
    private Logger logger = Logger.getLogger(CustomStack.class.getName());
    private E[] items;
    private int top;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomStack(int size){
        if(size <= 0){
            logger.info(String.format("Cannot create stack instance with [%d] size",size));
            throw new EmptyStackException();
        }
        items = (E[]) new Object[size];
        this.size = size;
        top =-1;
    }

    public void push(E item) {
        if(top == size - 1){
            logger.info("Cannot push to a full stack");
            throw new RuntimeException(String.format("Cannot add %d to a full stack",item));
        }
        items[++top] = item;
    }

    public E pop(){
        return items[top--];
    }

    public int count(){
        return top + 1;
    }

    public Boolean empty() {
        return top == -1;
    }
}
