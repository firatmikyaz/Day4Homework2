package Concretes;

import Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealCustomer(Customer customer) {
		
		return true;
	}
	
}
