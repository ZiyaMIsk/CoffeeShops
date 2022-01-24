package shops;



import shops.CustomerManager;
import Customer.Customer;
import Customer.CustomerCheckService;

public class StarbucksCustomerManager extends CustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager() {
		super();
	}


	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) throws Exception {
		
			if (customerCheckService.CheckIfRealPerson(customer)) {
			
				super.Save(customer);
			} 
			else {
				System.out.println("Böyle biri bulunmamaktadır.");
			}
		
		
	}


	
}
