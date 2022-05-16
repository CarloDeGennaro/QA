package VendingMachine;

public class VendingMachineRequest {
    public Product product;
    public CoinBundle enteredCoins;
    boolean request;

    public VendingMachineRequest(int selectedProduct,int[] enteredCoins) {
        this.product = Product.valueOf(selectedProduct);
        this.enteredCoins = new CoinBundle(enteredCoins);
    }
}