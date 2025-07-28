package multithreading;

public class ThreadCreationQues1 extends Thread {
    public ThreadCreationQues1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

    	ThreadCreationQues1 t1 = new ThreadCreationQues1("Scooby");
    	ThreadCreationQues1 t2 = new ThreadCreationQues1("Shaggy");

        t1.start();
        t2.start();
    }
}

