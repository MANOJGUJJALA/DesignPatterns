package src.AdaptorPattern;

public interface BankApiAdaptor {

    public String transfer(String toUserName, String fromUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenticate(String userName);
}
