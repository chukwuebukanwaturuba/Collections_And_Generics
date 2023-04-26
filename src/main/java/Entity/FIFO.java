package Entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FIFO {
    private Queue<Customer> fifoQueue;
    private Cashier cashier;
    public FIFO(Cashier cashier){
        this.cashier = cashier;
        this.fifoQueue = new LinkedList<>();
    }
    public void addCustomerToFIFO(Customer customer){
        fifoQueue.offer(customer);
    }
    public void FIFOcheckout(){
        while(!fifoQueue.isEmpty()) {
           cashier.checkOut(fifoQueue.poll());
            System.out.println();
            System.out.println("*******************************************");
            System.out.println();
        }
    }

    public Queue<Customer> getFifoQueue() {

        return fifoQueue;
    }
}
