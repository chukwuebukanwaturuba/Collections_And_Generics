package Interface;

import Entity.Applicant;
import Entity.Cashier;

public interface IManager {
    public void hireEmployee(Applicant applicant);
    public void fireCashier(Cashier cashier);
}
