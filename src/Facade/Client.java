package src.Facade;

public class Client {
    public static void main(String[] args) {
        Amazon a=new Amazon();
        a.orderPlaced();
        a.orderCancelled();
    }
}
