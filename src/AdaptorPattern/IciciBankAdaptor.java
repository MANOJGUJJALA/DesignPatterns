package src.AdaptorPattern;

import src.AdaptorPattern.ThirdParty.iciciapi;

public class IciciBankAdaptor implements BankApiAdaptor{

    private iciciapi ici;

    public IciciBankAdaptor() {
        this.ici = new iciciapi();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        long fromUserId = returnIdFromUserName(fromUserName);
        long toUserId = returnIdFromUserName(toUserName);
        return ici.doPayment(toUserId, fromUserId, amount);
    }

    @Override
    public double checkBalance(String userName) {
        return ici.balance(returnIdFromUserName(userName));
    }

    @Override
    public boolean authenticate(String userName) {
        return ici.checkUser(returnIdFromUserName(userName));
    }

    private long returnIdFromUserName(String userName){
        return 0;
    }
}
