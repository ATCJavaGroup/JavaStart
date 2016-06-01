package ru.sberdyshev.learn;

/**
 * Created by mqm on 01.06.2016.
 */
public class StackTest {
    public static void main(String [] args) {
        SbStack st = new SbStack();
        playWithStack(st);

        st = new SbStack(7);
        playWithStack(st);
    }

    public static void playWithStack(SbStack st) {
        System.out.println("Stack maximum size is " + st.getMaxSize());

        System.out.println("Stack length is " + st.getLength());
        st.push(4);
        st.push(11);
        st.push(12);
        st.showInfo();

        System.out.println("Get one value " + st.pop());
        st.showInfo();

        System.out.println("Get one value " + st.pop());
        st.showInfo();

        st.push(2);
        st.push(112);
        st.showInfo();

        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        System.out.println("Get one value " + st.pop());
        st.showInfo();

        st.push(6);
        st.push(19);
        st.push(3);
        st.showInfo();

        fillStack(st);
        st.showInfo();

        System.out.println("Get one value " + st.pop());
        st.showInfo();

        System.out.println();
        System.out.println("_____________________________________________________");
        System.out.println();
    }

    public static void fillStack(SbStack st) {
        for(int i=0; i<st.getMaxSize(); i++) {
            int x = (int) (Math.random()*150);
            if (!st.push(x)) {
                break;
            }
        }
    }
}
