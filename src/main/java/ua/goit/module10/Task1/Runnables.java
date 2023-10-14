package ua.goit.module10.Task1;

interface CustomRunnable extends Runnable {
    @Override
    public void run();
}

class FirstRunnable implements CustomRunnable { ;
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        Paused.paused(1000);

        while (true) {
            long currentTime = System.currentTimeMillis();
            long endTime = (currentTime - startTime) / 1000;
            System.out.println(Thread.currentThread().getName() + ": passed " + endTime + " seconds");
            Paused.paused(1000);
        }
    }
}


class SecondRunnable implements CustomRunnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        Paused.paused(5000);

        while (true) {
            long currentTime = System.currentTimeMillis();
            long endTime = (currentTime - startTime) / 1000;
            System.out.println(Thread.currentThread().getName() + ": passed " + endTime + " seconds");
            Paused.paused(5000);
        }
    }
}


class Paused {
    protected static void paused(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
