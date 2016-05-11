/**
 * Created by maria on 9/29/2015.
 */
public class PurchaseManager {
  public static void processOrder(Product product, Customer customer){
      if ( product.getQuantity() <= 0){
          throw new IllegalArgumentException("The product is out of stock");
      }

      if (customer.getBalance() < product.getPrice()){
          throw new IllegalArgumentException("You do not have enough money to buy this product!");
      }

      if (customer.getAge() < 18 && product.getAgeRestriction() == AgeRestriction.Adult) {
          throw new IllegalArgumentException("You are too young to buy this product!");
      }

      if (product.getClass().getSimpleName().equals("FoodProduct")){
          if (((FoodProduct)product).hasExpired()){
              throw new IllegalArgumentException("Product has expired");
          }
      }
        customer.setBalance(customer.getBalance() - product.getPrice());
       product.setQuantity(product.getQuantity() - 1);
  }

}
