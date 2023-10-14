package ua.goit.module10.Task1;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        FirstRunnable runnable1 = new FirstRunnable();
        SecondRunnable runnable2 = new SecondRunnable();

        Thread firstThread = new Thread(runnable1);
        Thread secondThread = new Thread(runnable2);

        firstThread.start();
        secondThread.start();
    }
}
