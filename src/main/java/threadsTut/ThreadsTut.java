package threadsTut;


//class MyTask extends Thread{
//    @Override
//    public void run() {
//        for(int i = 0; i <10; i++){
//            System.out.println("Task no:"+i);
//        }
//    }
//}



class Printer {
    void printDocument(int numOfCopies, String docName) {
        for (int i = 0; i < numOfCopies; i++) {
            System.out.println(">> printing" + docName + ":" + i);
        }
    }
}

class MyThread extends Thread {
    Printer pr;

    MyThread(Printer p) {
        pr = p;
    }

    @Override
    public void run() {
        pr.printDocument(10, "Michael Java Cv.pdf");
    }
}

public class ThreadsTut {

    public static void main(String[] args) {
        System.out.println("Start App");
        MyThread myThread = new MyThread(new Printer());
        myThread.start();
        System.out.println("Start finish");

    }


}
