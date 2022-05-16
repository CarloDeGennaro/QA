package VendingMachine;

//since we will receive a bunch of coins and return a bunch of coins, we could represent a class
//instead of passing around an array of numbers representing the number of coins

public class CoinBundle {
		public int number1CentCoins;
	    public int number5CentsCoins;
	    public int number10CentsCoins;
	    public int number25CentsCoins;

	    public CoinBundle(int[] enteredCoins) { //0,2,2,1 for example
	    	this.number1CentCoins = enteredCoins[0];
	        this.number5CentsCoins = enteredCoins[1];
	        this.number10CentsCoins = enteredCoins[2];
	        this.number25CentsCoins = enteredCoins[3];

	    }


	    public int getTotal(){
	        int total = 0;
	        total = total+this.number1CentCoins*Coin.ONE_CENTS.getValue();
	        total = total+this.number5CentsCoins*Coin.FIVE_CENTS.getValue();
	        total = total+this.number10CentsCoins*Coin.TEN_CENTS.getValue();
	        total = total+this.number25CentsCoins*Coin.TWENTYFIVE_CENTS.getValue();
	        return total;
	    }
	}