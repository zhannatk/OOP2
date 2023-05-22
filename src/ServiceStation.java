import OPP2HW.Serviceable;

public class ServiceStation {
    public  void doStuff(Serviceable customersTransport){
        makeCoffeeForCustomer();
        check(customersTransport);
        checkOut();
        System.out.println();
    }
    private void makeCoffeeForCustomer(){
        System.out.println("Предлагаем кофе");
    }
    private void checkOut(){
        System.out.println("Берём оплату");
    }

    private void check(Serviceable transport) {
        transport.service();
    }

}