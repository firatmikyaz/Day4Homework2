package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;
import Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealCustomer(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try 
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula
					(
					Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear()
					);
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}

		return result;
		
	}
	
}
