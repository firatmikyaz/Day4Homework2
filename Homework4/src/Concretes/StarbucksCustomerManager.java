package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealCustomer(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("kullanici bulunamadi");
		}
	}
	
}
