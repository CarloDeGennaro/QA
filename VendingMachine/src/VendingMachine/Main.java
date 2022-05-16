package VendingMachine;

import java.util.Scanner;

// The Main class will start the program and coordinate the communication between
// the user and the VendingMachineInterface

public class Main {

    public static void main(String[] args) throws Exception{
    	
        Scanner scanner = new Scanner(System.in);

        VendingMachineInterface machineInterface = new TextVendingMachineInterface();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        if(Integer.parseInt(selectedProduct)>3)
        	throw new Exception("product not present");
        	
 
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        //After receiving the coins from the user as a String (0,2,0,1), we will need to convert them to an array of numbers.
        String userEnteredCoins = scanner.nextLine();
        
        
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}