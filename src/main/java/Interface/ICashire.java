package Interface;

import Entity.Customer;

public interface ICashire {
    public void receipt(Customer customer);

    public void checkOut(Customer customer);
    public void addCustomerToQueue(Customer customer);
    public void attendToCustomers();
}
