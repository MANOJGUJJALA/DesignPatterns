package src.AdaptorPattern;

import src.AdaptorPattern.ThirdParty.yesbankapi;

public class YesBankAdaptor implements BankApiAdaptor{
    private yesbankapi yesBankAPI;

    public YesBankAdaptor() {
        this.yesBankAPI = new yesbankapi();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        char result = yesBankAPI.transfer(toUserName, fromUserName, (int)amount);
        if(result == 'D')
            return "Success";
        else
            return "Failure";
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenticate(String userName) {
        return yesBankAPI.authenticate(userName) == 'Y';
    }
}
