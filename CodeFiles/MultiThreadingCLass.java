class MultiThreadingClass extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        MultiThreadingClass t1=  new MultiThreadingClass();
        // MultiThreadingClass t2 = new MultiThreadingClass();
        t1.start();
    }
}