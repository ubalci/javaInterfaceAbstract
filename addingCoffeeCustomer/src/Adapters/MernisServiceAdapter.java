package Adapters;

import java.rmi.RemoteException;

import Abstracts.ICustomerCheckService;

import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	public boolean result;
	@Override
	public boolean checkifRealPerson(Customer customer){
		KPSPublicSoapProxy validate = new KPSPublicSoapProxy();
		try {
			return result = validate.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
							customer.getFirstName(), 
							customer.getLastName(),
							customer.getBornYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
