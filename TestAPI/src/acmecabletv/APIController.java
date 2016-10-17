package acmecabletv;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import acmecabletv.datalayer.CustomerInvoice;
import acmecabletv.utils.HelperUtility;

@RestController
public class APIController {

	acmecabletv.datalayer.InvioceRepository invrepo;

	@RequestMapping(value = "/invoices", method = RequestMethod.GET, params = { "customerId", "month" })
	public CustomerInvoice getInvoiceByMonth(@RequestParam String customerId,
									 @RequestParam String month){
		Date queryDateRange[] = acmecabletv.utils.HelperUtility.getDateRange(month);
		return invrepo.findByCustomerIdAndMonth(customerId, queryDateRange[0], queryDateRange[1]);
	}


	@RequestMapping(value = "/invoices", method = RequestMethod.GET, params = { "customerId", "filter", "month" })
	public CustomerInvoice getInvoiceForShop(@RequestParam String customerId,
									 @RequestParam String filter,
									 @RequestParam String month){
		Date queryDateRange[] = acmecabletv.utils.HelperUtility.getDateRange(month);
		return invrepo.findByCustomerIdAndMonthAndInvoiceType(customerId, queryDateRange[0], queryDateRange[1], filter);
	}


	@RequestMapping(value = "/invoices", method = RequestMethod.GET, params = { "customerId", "addressId" })
	public List<CustomerInvoice> getInvoiceForAddress(@RequestParam String customerId,
									 @RequestParam String addressId){
		return invrepo.findByCustomerIdAndAddressId(customerId, addressId);
	}

	@RequestMapping(value = "/invoices", method = RequestMethod.GET, params = "customerId")
	public List<CustomerInvoice> getInvoiceFull(@RequestParam String customerId){
		return invrepo.findByCustomerId(customerId);
	}

	@RequestMapping(value = "/invoices", method = RequestMethod.POST)
	public CustomerInvoice generateInvoice(@RequestBody Invoice input){
		//Build DB friendly CustomerInvoice Object
		CustomerInvoice custinv = new CustomerInvoice(input);
		return invrepo.save(custinv);
	}
}

