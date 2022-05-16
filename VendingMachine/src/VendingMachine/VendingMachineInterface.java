package VendingMachine;

//The VendingMachineInterface is the class that will communicate with the user

public interface VendingMachineInterface {

    void displayProducts(); // displays a message in the console welcoming the user and showing the available products.

    void selectProduct(int product); // it receives the product selected by the user.

    void displayEnterCoinsMessage(); // method that displays a message requesting the user to enter coins

    void enterCoins(int[] coins); // it receives the coins entered by the user.

    void displayChangeMessage(); //it displays a message letting the user know his change amount and coins.
}