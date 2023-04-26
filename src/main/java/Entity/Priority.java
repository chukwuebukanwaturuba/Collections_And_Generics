package Entity;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority{
    private Cashier cashier;
    private Queue<Customer> priorityQueue;

    public Priority(Cashier cashier){
        this.cashier = cashier;
        priorityQueue = new PriorityQueue<>();
    }
    public  void addCustomerToPriority(Customer customer) {
        priorityQueue.offer(customer);
    }
    public void priorityCheckout() {
        while (!priorityQueue.isEmpty()) {
            cashier.checkOut(priorityQueue.poll());
            System.out.println();
            System.out.println("*******************************************");
            System.out.println();
        }
    }

    public Queue<Customer> getPriorityQueue() {
        return priorityQueue;
    }
}
