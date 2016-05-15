public class Customer {
    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance){
        this.setName(name);
        this.setAge(age);
        this.setBalance(balance);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String nameValue){
        if (nameValue == null || nameValue.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = nameValue;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int ageValue){
        if (ageValue <= 0){
            throw new IllegalArgumentException("Age must a positive number.");
        }
        this.age = ageValue;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balanceValue){
        this.balance = balanceValue;
    }
}
