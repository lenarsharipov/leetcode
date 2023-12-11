package com.algos.lafore.stack;

public class StackApp {
    public static void main(String[] args) {
        StackX stack = new StackX(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println(value);
        }

    }
}