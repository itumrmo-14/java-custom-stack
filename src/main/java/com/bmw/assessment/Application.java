package com.bmw.assessment;

import com.bmw.assessment.util.CustomStack;

public class Application {
    public static void main(String[] args) {
        CustomStack<String> strings = new CustomStack<>(20);
        strings.push("one");
        strings.push("two");
        strings.push("three");
        System.out.println("count is now "+strings.count());
    }
}
