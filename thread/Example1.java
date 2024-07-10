package thread;

public class Example1 {
    public static void main(String[] args) {
        var t1 = new ThreadWithInheritance("Thread 1");
        var t2 = new Thread(new ThreadWithInterface("Thread 2", 5));
        // Default priority
        t1.start();
        t2.start();

        // Set priority
        // t1.setPriority(10);
        // t2.setPriority(1);
        // t1.start();
        // t2.start();
    }
}

class ThreadWithInheritance extends Thread {

    ThreadWithInheritance(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " - " + this.getPriority() + " ==> Thread is started");
        try {
            System.out.println(this.getName() + " - " + this.getPriority() + " ==> Thread is running");
            Thread.sleep(2000);
            System.out.println(this.getName() + " - " + this.getPriority() + " ==> Thread is finished");
        } catch (Exception e) {
            System.out.println(this.getName() + " - " + this.getPriority() + " ==> Thread is finished with error: "
                    + e.getMessage());
        }
    }

}

class ThreadWithInterface implements Runnable {

    private final String name;
    private final int priority;

    ThreadWithInterface(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println(this.name + " - " + this.priority + " ==> Thread is started");
        try {
            System.out.println(this.name + " - " + this.priority + " ==> Thread is running");
            Thread.sleep(2000);
            System.out.println(this.name + " - " + this.priority + " ==> Thread is finished");
        } catch (Exception e) {
            System.out.println(this.name + " - " + this.priority + " ==> Thread is finished with error: "
                    + e.getMessage());
        }
    }

}
