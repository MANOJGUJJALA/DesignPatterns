package SingletonPattern;

public class SingletonMultithreaded {

    private static SingletonMultithreaded instance;
    private int noOfConnections;

    private SingletonMultithreaded(){
        noOfConnections=0;
    }

    public static SingletonMultithreaded getInstance(){

        if (instance==null){
            synchronized (SingletonMultithreaded.class){
                if(instance==null){
                    instance=new SingletonMultithreaded();
                }
            }
        }
        return instance;
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
