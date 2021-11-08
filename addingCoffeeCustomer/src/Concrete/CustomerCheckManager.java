package Concrete;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkifRealPerson(Customer customer) throws Exception {
		
		return true;
	}

}
