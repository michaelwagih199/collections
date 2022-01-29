package concurency;

public class ThreadExample {

    private static int num =5;
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("start");
            System.out.println("finish:".concat(String.valueOf(num)));

        }
    }

    public static class MyRunable implements Runnable {
        @Override
        public void run() {
            System.out.println("start runable");
            System.out.println("finish Runable:".concat(String.valueOf(num)));
        }
    }





    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("start Annynomus runable");
                System.out.println("finish Annynomus:".concat(String.valueOf(num)));
            }
        };

        Runnable runnableLamda = () -> {
            mb();
//            System.out.println(Thread.currentThread().getName().concat("running"));
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("finished");
        };

        Thread myThread  = new Thread(runnableLamda,"Read File1\t");
        myThread.start();
    }


    static void mb(){
System.out.println("run");
    }
}
