class MyThread implements Runnable {
    private String message;

    public MyThread(String msg) {
        message = msg;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started...");
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(message);
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}