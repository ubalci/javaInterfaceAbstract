package Abstracts;

import Entities.Customer;

public interface ICustomerCheckService {
	boolean checkifRealPerson(Customer customer) throws Exception;
}
