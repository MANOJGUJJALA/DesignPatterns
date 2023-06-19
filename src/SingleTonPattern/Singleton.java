package src.SingleTonPattern;

public class Singleton {

    private static Singleton instance;

    private int noOfConnections;
    private Singleton(){
        noOfConnections=0;
    }

    public static Singleton getInstance(){

        if (instance==null){

        instance=new Singleton();
        }
        return  instance;
    }

    public void DbConnection(){
        if (noOfConnections<3){
            noOfConnections++;
            System.out.println("database connection established..");
        }else{
            System.out.println("database connection Failed..!");
        }
    }

}
