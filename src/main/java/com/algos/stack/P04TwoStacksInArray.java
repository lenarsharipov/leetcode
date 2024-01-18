package com.algos.stack;

/**
 * Problem 4: Implement Two Stacks in an Array
 * Problem Statement
 * Your task is to implement two stacks in a single array efficiently.
 * You need to provide the following methods for the stacks: push1, push2, pop1, pop2.
 *
 * Examples
 * Example 1:
 *
 * push1(1)
 * push2(2)
 * push2(3)
 * push1(4)
 * pop1() //returns 4
 * pop2() //returns 3
 * Example 2:
 *
 * push2(1)
 * push2(2)
 * push1(3)
 * push2(4)
 * pop1() //returns 3
 * pop2() //returns 4
 * Example 3:
 *
 * push1(1)
 * push1(2)
 * push1(3)
 * push2(4)
 * pop1() //returns 3
 * pop2() //returns 4
 *
 *
 * The time complexity for each operation (push and pop)
 * is O(1) because each operation only involves a constant
 * amount of work. The space complexity is O(n), where n is
 * the size of the array, because the array's size is the
 * main factor that determines the amount of memory used.
 */
public class P04TwoStacksInArray {
    int size;
    int top1, top2;
    int[] arr;

    P04TwoStacksInArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
}
