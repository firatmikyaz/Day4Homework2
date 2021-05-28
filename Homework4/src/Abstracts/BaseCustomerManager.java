package Abstracts;

import Entities.Concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	
	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanưna kaydedildi " + customer.getFirstName());
	}
}
