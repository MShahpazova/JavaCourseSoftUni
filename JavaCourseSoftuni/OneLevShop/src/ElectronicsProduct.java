/**
 * Created by maria on 9/24/2015.
 */
public class ElectronicsProduct extends Product{
    private int guaranteePeriod;
    public ElectronicsProduct (String name, double price, int quantity, AgeRestriction ageRestriction, int guaranteePeriod){
        super(name, price, quantity, ageRestriction);
            this.setGuaranteePeriod(guaranteePeriod);
    }
    public int getGuaranteePeriod(){
        return this.guaranteePeriod;
    }
    public void setGuaranteePeriod(int guaranteePeriod){
        if (guaranteePeriod < 0){
            throw new IllegalArgumentException("Guarantee period must not be a negative value.");
        }
        else {
            this.guaranteePeriod = guaranteePeriod;
        }
    }
}
