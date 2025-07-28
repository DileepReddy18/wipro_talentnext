package multithreading;

import java.util.Random;

public class ThreadCreationQues2 implements Runnable {
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
    Random rand = new Random();

    public void run() {
        while (true) {
            int index = rand.nextInt(colours.length); // Random index between 0 and colours.length - 1
            String color = colours[index];
            System.out.println("Color: " + color);

            if (color.equals("red")) {
                System.out.println("Red found! Stopping thread.");
                break; // Exit loop if color is red
            }

            try {
                Thread.sleep(500); // Optional: pause for better readability
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
    	ThreadCreationQues2 display = new ThreadCreationQues2();
        Thread t = new Thread(display);
        t.start();
    }
}

