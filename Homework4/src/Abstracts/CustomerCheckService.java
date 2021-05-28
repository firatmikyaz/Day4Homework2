package Abstracts;

import Entities.Concretes.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealCustomer(Customer customer);
}
