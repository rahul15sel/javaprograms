package test;

class A extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Hello**");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Hi**");
        }
    }
}

public class ThreadPractice {

    public static void main(String arg[]) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
        System.out.println();
        System.out.println();
    }
}




