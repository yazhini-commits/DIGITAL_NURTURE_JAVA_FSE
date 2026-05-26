package UPSKILLING.MODULE_3.CORE_JAVA;

public class Z40_VIRTUAL_THREADS {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = Thread.startVirtualThread(() -> System.out.println("Virtual thread 1 running."));
        Thread thread2 = Thread.startVirtualThread(() -> System.out.println("Virtual thread 2 running."));
        thread1.join();
        thread2.join();
        System.out.println("Virtual threads have completed.");
    }
}
