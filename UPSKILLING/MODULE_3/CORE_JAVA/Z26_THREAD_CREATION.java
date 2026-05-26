package UPSKILLING.MODULE_3.CORE_JAVA;

public class Z26_THREAD_CREATION {
    static class MessageThread extends Thread {
        private final String message;

        MessageThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(message + " " + (i + 1));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MessageThread("Thread 1 says");
        Thread thread2 = new MessageThread("Thread 2 says");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Both threads have finished.");
    }
}
