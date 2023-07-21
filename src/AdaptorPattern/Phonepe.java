package src.AdaptorPattern;

public class Phonepe {

        private BankApiAdaptor bankApiAdaptor;

        Phonepe(){
            bankApiAdaptor=new IciciBankAdaptor();
            // i can change to icicbankadaptor thats it
        }

    public String transferMoney(String fromUserName, String toUserName,
                                double amount){
        String result = bankApiAdaptor.transfer(fromUserName, toUserName, (int)amount);
        return result;
    }


    public double checkBalance(String userName){
        return bankApiAdaptor.checkBalance(userName);
    }

    public boolean login(String userName){
        return bankApiAdaptor.authenticate(userName);
    }

}
