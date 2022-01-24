

import Adapter.MernisServiceAdapter;
import Customer.Customer;
import shops.CustomerManager;
import shops.StarbucksCustomerManager;
import shops.NeroCustomerManager;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager1= new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			customerManager1.Save(new Customer(1, "Ziya Mustafa", "Işık", 1995, "46966131006"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerManager customerManager2= new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			customerManager2.Save(new Customer(2, "Ziya Mustafa", "Işık", 1995, "46966131116"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CustomerManager customerManager3= new NeroCustomerManager();
		customerManager3.Save(new Customer(3, "Engin", "Demiroğ", 1985, "12314516700"));
	}

}
		