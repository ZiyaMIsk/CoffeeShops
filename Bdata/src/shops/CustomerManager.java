package shops;

import Customer.CustomerService;

import Customer.Customer;

public abstract class CustomerManager implements CustomerService  {

		@Override
	public void Save(Customer customer) throws Exception {
		
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlı kişi veritabanına eklendi.");
	}

}
