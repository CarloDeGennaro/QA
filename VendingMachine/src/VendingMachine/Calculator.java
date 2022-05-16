package VendingMachine;

// The calculator class will carry out operations to work out the total amount inserted
// and the minimum coins to return a change amount.
public interface Calculator {

    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);

}