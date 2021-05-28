import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setFirstName("Fýrat");
		customer.setLastName("Mikyaz");
		customer.setDateOfBirth(LocalDate.of(1991,8,1));
		customer.setNationalityId("11111111111");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}
}
