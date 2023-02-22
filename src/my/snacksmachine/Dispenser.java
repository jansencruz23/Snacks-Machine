package my.snacksmachine;
/**
 *
 * @author Jansen C. Cruz
 */
public class Dispenser {
    private int numberOfItems;
    private int cost;
    
    public Dispenser(){
        numberOfItems = 5;
        cost = 50;
    }
    
    public Dispenser(int numberOfItems, int cost){
        this.numberOfItems = numberOfItems;
        this.cost = cost;
    }
    
    public int getCount(){
        return numberOfItems;
    }
    
    public int getProductCost(){
        return cost;
    }
    
    public void makeSale(){
        numberOfItems--;
    }
}