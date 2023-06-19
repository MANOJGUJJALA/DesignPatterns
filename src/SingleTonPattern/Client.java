package src.SingleTonPattern;

public class Client {

    public static void main(String[] args) {

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        Singleton s4=Singleton.getInstance();


        s1.DbConnection();
        s1.DbConnection();
        s2.DbConnection();
        s2.DbConnection();
        s3.DbConnection();
        s3.DbConnection();
        s4.DbConnection();
        s4.DbConnection();

    }



}
