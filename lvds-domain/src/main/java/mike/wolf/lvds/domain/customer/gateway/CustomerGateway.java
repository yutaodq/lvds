package mike.wolf.lvds.domain.customer.gateway;

import mike.wolf.lvds.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
