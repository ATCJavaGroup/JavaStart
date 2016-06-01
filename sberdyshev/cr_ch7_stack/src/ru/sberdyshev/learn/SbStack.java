package ru.sberdyshev.learn;

/**
 * Created by mqm on 01.06.2016.
 */
public class SbStack {
    private int [] stack;
    private int length;
    private int maxSize;

    public SbStack() {
        maxSize = 15;
        stack = new int[maxSize];
        length = 0;
    }

    public SbStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean push(int val){
        if (length >= maxSize) {
            System.out.println("The stack is full");
            return false;
        } else {
            stack[length] = val;
            length++;
            return true;
        }
    }

    public int pop() {
        int result = -1;
        if (length == 0) {
            System.out.println("The stack is empty");
        } else {
            result = stack[length - 1];
            stack[length - 1] = 0;
            length--;
        }
        return result;
    }

    public void showAll(){
        System.out.println("Show all values");
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("It's empty!");
        }
    }

    public void showInfo() {
        System.out.println("Stack length is " + getLength());
        showAll();
    }
}
