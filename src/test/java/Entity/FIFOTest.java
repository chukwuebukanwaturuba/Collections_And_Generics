package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIFOTest {

    @Test
    void FIFOcheckout() {
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

        customer1.buyProduct(store.getListOfProduct().get(5), 12);
        customer2.buyProduct(store.getListOfProduct().get(3), 1);
        customer2.buyProduct(store.getListOfProduct().get(3), 3);
        customer3.buyProduct(store.getListOfProduct().get(7), 7);
        customer3.buyProduct(store.getListOfProduct().get(3), 1);
        customer4.buyProduct(store.getListOfProduct().get(9), 10);
        customer4.buyProduct(store.getListOfProduct().get(9), 10);
        customer4.buyProduct(store.getListOfProduct().get(2), 3);
        customer5.buyProduct(store.getListOfProduct().get(6), 5);
        customer6.buyProduct(store.getListOfProduct().get(2), 5);
        customer6.buyProduct(store.getListOfProduct().get(3), 5);
        customer6.buyProduct(store.getListOfProduct().get(4), 5);
        customer6.buyProduct(store.getListOfProduct().get(5), 5);

        // attends to customers based on FIFO

        FIFO fifo = new FIFO(cashier1);

        fifo.addCustomerToFIFO(customer1);
        fifo.addCustomerToFIFO(customer2);
        fifo.addCustomerToFIFO(customer3);
        fifo.addCustomerToFIFO(customer4);
        fifo.addCustomerToFIFO(customer5);
        fifo.addCustomerToFIFO(customer6);

      assertTrue(customer1.equals(fifo.getFifoQueue().poll()));



    }
}