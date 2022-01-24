package Adapter;

import java.rmi.RemoteException;


import Customer.Customer;
import Customer.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy =new KPSPublicSoapProxy();
		
		
		
		try {
			return proxy.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()).longValue(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
		} 
		
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			
			return false;
		}
		
	}
}
