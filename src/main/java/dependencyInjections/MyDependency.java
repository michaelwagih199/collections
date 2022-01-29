package dependencyInjections;


public class MyDependency {

    public static void main(String[] args) {
        Client client = new Client();
        client.doSomething();
    }
}

class Client {
    private ServiceB service;
    public void doSomething() {
        service = new ServiceB();
        System.out.println(service.getInfo());
    }

}


class ServiceB {
    public String getInfo() {
        return "ServiceB's Information";
    }
}