package dependencyInjections;


class ClientA {

    private Service service;

    //constructor injections
//    ClientA(Service service) {
//        this.service = service;
//    }

    // set dependency
    public void setService(Service service) {
        this.service = service;
    }

    public void doSomething() {
        System.out.println(service.getInfo());
    }

    public void doFore() {
        service.doFore();
    }


}

public class SoftDepennency {
    public static void main(String[] args) {
        ClientA clientA = new ClientA();
        clientA.setService(new Service1());
        clientA.doSomething();
        clientA.doFore();
    }
}


interface Service {
    String getInfo();
    void doFore();
}

class Service1 implements Service {

    @Override
    public String getInfo() {
        return "Service 1 implements";
    }

    @Override
    public void doFore() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I LoVe Music" + i);
        }
    }
}

class Service2 implements Service {

    @Override
    public String getInfo() {
        return "Service 2 implements";
    }

    @Override
    public void doFore() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I LoVe YoU" + i);
        }
    }
}



