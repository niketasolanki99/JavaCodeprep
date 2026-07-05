package multithreading;

class Demo extends Thread {

    @Override
    public void run() {
        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("this.getName() : " + this.getName());
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d.run();
    }
}