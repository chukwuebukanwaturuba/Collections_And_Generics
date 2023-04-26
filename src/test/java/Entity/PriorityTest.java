package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityTest {

    @Test
    void priorityCheckout() {
        Store store = new Store("MaxStore");
        RFileReader fR = new RFileReader(store);
        fR.readFile();


        Manager manager = new Manager(store);

        Applicant applicant1 = new Applicant("Favor", 24);

        manager.hireEmployee(applicant1);

        Cashier cashier1 = new Cashier(applicant1.getName(), store, 1000);

        manager.addNewCashier(cashier1);


        Customer customer1 = new Customer("Chi", 7000000, store);
        Customer customer2 = new Customer("Chizoba", 90000, store);
        Customer customer3 = new Customer("Frank", 700000, store);
        Customer customer4 = new Customer("Cynthia", 170000, store);
        Customer customer5 = new Customer("Ola", 120000, store);
        Customer customer6 = new Customer("Tony", 120000, store);

        customer1.buyProduct(store.getListOfProduct().get(5), 1);
        customer2.buyProduct(store.getListOfProduct().get(3), 1);
        customer2.buyProduct(store.getListOfProduct().get(3), 3);
        customer3.buyProduct(store.getListOfProduct().get(7), 7);
        customer3.buyProduct(store.getListOfProduct().get(3), 1);
        customer4.buyProduct(store.getListOfProduct().get(9), 1);
        customer4.buyProduct(store.getListOfProduct().get(9), 1);
        customer4.buyProduct(store.getListOfProduct().get(2), 3);
        customer5.buyProduct(store.getListOfProduct().get(6), 5);
        customer6.buyProduct(store.getListOfProduct().get(2), 5);
        customer6.buyProduct(store.getListOfProduct().get(3), 5);
        customer6.buyProduct(store.getListOfProduct().get(4), 5);
        customer6.buyProduct(store.getListOfProduct().get(5), 5);



        // attends to customers based on number of cart items.
        System.out.println("\n\n\n");
        System.out.println("********************");
        Priority priority = new Priority(cashier1);

        priority.addCustomerToPriority(customer1);
        priority.addCustomerToPriority(customer2);
        priority.addCustomerToPriority(customer3);
        priority.addCustomerToPriority(customer4);
        priority.addCustomerToPriority(customer5);
        priority.addCustomerToPriority(customer6);

     assertTrue(customer6.equals(priority.getPriorityQueue().poll()));

    }
}