/**
 * Created by maria on 9/29/2015.
 */
public class Appliance extends ElectronicsProduct {
        private final static int GUARANTEED_PERIOD = 6;
        private double priceDiscount;
        public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction){
            super(name, price, quantity, ageRestriction, GUARANTEED_PERIOD);
            this.priceDiscount = 105d/100d;
        }
    @Override
    public double getPrice(){
        if (this.getQuantity() <= 50){
            return super.getPrice() * priceDiscount;
        }
        else {
            return super.getPrice();
        }
    }
}
