package src.AdaptorPattern.ThirdParty;

public class yesbankapi {
    public char transfer(String fromPerson, String toPerson, int amount){
        System.out.println("Amount transferred");
        return 'D';
    }

    public int checkBalance(String accountDetails){
        //logic for checking acconut balance
        return 1000;
    }

    public char authenticate(String accountDetails){
        //logic for authentication
        return 'Y';
    }
}
