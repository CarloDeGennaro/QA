package VendingMachine;

//the Product class that will define the product that this vending machine offers
//This class has two pieces of information: the selection number to buy the product and the price

public enum Product {
    CHOCOLATE(1,75), CRISP(2,65), WATER(3,40), EMPTY(0,0);

    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber(){
        return selectionNumber;
    }

    public int getPrice(){
        return this.price;
    }
//This method will map a number inserted by the user with an available product.
    public static Product valueOf(int numberSelection) {
        for(Product product: Product.values()){
            if(numberSelection == product.getSelectionNumber()){
                return product;
            }
        }
        return EMPTY;

    }
}