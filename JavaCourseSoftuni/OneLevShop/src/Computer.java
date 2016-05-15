
public class Computer extends ElectronicsProduct {
    private  double _priceDiscount = 95;
    private static final int GUARANTEED_PERIOD = 24;
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, GUARANTEED_PERIOD );
        this._priceDiscount = 95d/100d;
    }

    @Override
    public double getPrice(){
        if (this.getQuantity() >= 1000 ) {
            return super.getPrice() * _priceDiscount;
        }
        else {
            return super.getPrice();
        }
    }
}
