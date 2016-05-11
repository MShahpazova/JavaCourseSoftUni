/**
 * Created by maria on 9/24/2015.
 */
public abstract class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction){
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setAgeRestriction(ageRestriction);

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.isEmpty() || name.equals(null)){
            throw new IllegalArgumentException("Name must not be null ot empty");
        }
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        if ( price < 0){
            throw new IllegalArgumentException("Price must not be anegative number");
        }
        this.price = price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        if ( quantity < 0){
            throw new IllegalArgumentException("Quantity must not be a negative number ");
        }
        this.quantity = quantity;
    }
    public AgeRestriction getAgeRestriction(){
        return this.ageRestriction;
    }
    public void setAgeRestriction(AgeRestriction ageRestriction){
        this.ageRestriction = ageRestriction;
    }
}
