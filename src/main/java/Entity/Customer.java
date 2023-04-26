package Entity;

import Interface.ICustomer;

import java.util.ArrayList;

public class Customer extends Person implements ICustomer, Comparable<Customer>{
    private String name;
    private double walletBalance;
    private Store store;
    private static int ID = 1;
    private int customerID;

    private ArrayList<Product> cart;
    private double amount = 0;

    Customer(String name, double walletBalance, Store store){
        super(name);
        this.walletBalance = walletBalance;
        this.store = store;
        this.customerID = ID;
        this.cart = new ArrayList<>();
        ID++;
    }
    @Override
    public void buyProduct(Product product, int quantity) {
        Product newProd = new Product(product.getProductName(), product.getCategory(), product.getPricePerUnit(), quantity);
        for (int i = 0; i < store.getListOfProduct().size(); i++) {
            if(store.getListOfProduct().get(i).getProductName().equals(newProd.getProductName())){
                if(store.getListOfProduct().get(i).getQuantity() < quantity) {
                    System.out.println("Out of Stock");
                }
                else {
                    cart.add(newProd);
                }

            }

        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double amount) {
        this.walletBalance -= amount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public static int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerID=" + customerID +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return o.cart.size() - this.cart.size();
    }
}
