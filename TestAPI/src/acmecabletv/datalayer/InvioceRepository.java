package acmecabletv.datalayer;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InvioceRepository extends CrudRepository<CustomerInvoice, Long>{

	//Select Queries
	static final String QueryByMonth =
			"SELECT * FROM CustomerInvoice u WHERE u.customerId = ?1 AND u.startDate >= ?2 AND u.endDate <= ?3";
	static final String QueryInvByShopPurchase =
			"SELECT * FROM CustomerInvoice u WHERE u.customerId = ?1 AND u.startDate >= ?2 AND u.endDate <= ?3 AND u.invoiceType LIKE like CONCAT(?4, '%')";

	//Invoices history Full (By Customer ID)
	public List<CustomerInvoice> findByCustomerId(@Param("customerId") String customerId);

	//Invoices By Month (Customer ID and Month)
	@Query(QueryByMonth)
	public CustomerInvoice findByCustomerIdAndMonth(
			@Param("customerId") String customerId,
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	//Invoices By Shop Purchase (Customer ID, Month and Shop)
	@Query(QueryInvByShopPurchase)
	public CustomerInvoice findByCustomerIdAndMonthAndInvoiceType(
				@Param("customerId") String customerId,
				@Param("startDate") Date startDate,
				@Param("endDate") Date endDate,
				@Param("invoiceType") String invoiceType);

	//Invoices By Address (Customer ID and Address ID)
	public List<CustomerInvoice> findByCustomerIdAndAddressId(
			@Param("customerId") String customerId,
			@Param("addressId") String aaddressId);


	//Insert Query
	public CustomerInvoice save(CustomerInvoice inv);

}
