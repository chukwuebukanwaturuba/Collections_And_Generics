package Entity;

import java.util.PriorityQueue;
import java.util.Queue;

public class Cashier extends Person{
    private int staffID;
    private Store store;
    private String name;
    private boolean isfired;

    private int noOfSales=0;

    public Cashier(String name, Store store, int staffID) {
        super(name);
        this.staffID = staffID;
        this.store = store;

    }


    public void checkOut(Customer customer) {
        for(Product p : customer.getCart()) {
            customer.setAmount(p.getPricePerUnit() * p.getQuantity());
        }
        if (customer.getAmount() <= customer.getWalletBalance()) {
            customer.setWalletBalance(customer.getAmount());
            receipt(customer);
            setNoOfSales(1);
        } else {
            System.out.println("Insufficient funds.");
        }
    }


    public int getNoOfSales() {
        return noOfSales;
    }

    public void setNoOfSales(int noOfSales) {
        this.noOfSales += noOfSales;
    }

    public int getStaffID() {
        return staffID;
    }

    public boolean isIsfired() {
        return isfired;
    }

    public void setIsfired(boolean isfired) {

        this.isfired = isfired;
    }

    public void receipt(Customer customer) {
        System.out.printf("Receipt: %n %s", customer.getName());
        for(Product p : customer.getCart()){
            System.out.printf("%n Product: %s %n Price: %.2f %n Quantity %d %n Amount: %.2f %n",p.getProductName(),
                    p.getPricePerUnit(), p.getQuantity(), customer.getAmount());
        }
    }

    @Override
    public String toString() {
        return "Cashier{" + "name: " + this.getName() +
                " staffID: " + staffID +
                '}';
    }
}
