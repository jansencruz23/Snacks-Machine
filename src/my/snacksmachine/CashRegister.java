package my.snacksmachine;
/**
 *
 * @author Jansen C. Cruz
 */
public class CashRegister {
    private int cashOnHand;
    
    public CashRegister(){
        cashOnHand = 500;
    }
    
    public CashRegister(int cashOnHand){
        this.cashOnHand = cashOnHand;
    }
    
    public void acceptAmount(int amount){
        cashOnHand += amount;
    }
}