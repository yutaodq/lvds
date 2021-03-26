package mike.wolf.lvds.domain.customer.gateway;

import mike.wolf.lvds.domain.customer.Customer;
import mike.wolf.lvds.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
