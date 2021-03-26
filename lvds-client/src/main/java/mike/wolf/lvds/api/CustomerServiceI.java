package mike.wolf.lvds.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import mike.wolf.lvds.dto.CustomerAddCmd;
import mike.wolf.lvds.dto.CustomerListByNameQry;
import mike.wolf.lvds.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
