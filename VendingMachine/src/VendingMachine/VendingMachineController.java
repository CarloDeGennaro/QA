package VendingMachine;

//The interface doesn’t need to know how to calculate the change,
//it only needs to know where to request it.

public interface VendingMachineController {

    CoinBundle calculateChange(VendingMachineRequest request);
}
