import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(2,"ENGÝN","DEMÝROÐ",1985,"28861499108"));
	}

}
