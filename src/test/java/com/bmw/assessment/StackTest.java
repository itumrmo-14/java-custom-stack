package com.bmw.assessment;

import com.bmw.assessment.util.CustomStack;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {

    @Test
    public void push(){
        //given
        CustomStack<Integer> numbers = new CustomStack<>(5);
        //when
        numbers.push(1);
        numbers.push(8);
        //then
        Assert.assertEquals(2,numbers.count());
    }

    @Test
    public void pop(){
        //given
        CustomStack<Integer> numbers = new CustomStack<>(5);
        //when
        numbers.push(1);
        numbers.push(8);
        numbers.push(10);
        numbers.push(2);
        numbers.pop();
        //then
        Assert.assertEquals(3,numbers.count());
    }

    @Test
    public void empty(){
        //given
        CustomStack<Integer> numbers = new CustomStack<>(2);
        //when
        numbers.push(1);
        numbers.pop();
        //then
        Assert.assertTrue(numbers.empty());
    }

    @Test(expected = RuntimeException.class)
    public void fullStackException(){
        //given
        CustomStack<Integer> numbers = new CustomStack<>(2);
        //when
        numbers.push(2);
        numbers.push(4);
        numbers.push(6);
    }

    @Test(expected = EmptyStackException.class)
    public void emptyStackException(){
        //given
        CustomStack<Integer> numbers = new CustomStack<>(0);
    }
}
