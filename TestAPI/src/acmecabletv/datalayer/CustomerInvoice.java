package acmecabletv.datalayer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import acmecabletv.Invoice;
import acmecabletv.utils.HelperUtility;

@Entity
@Table(name = "CustomerInvoice")
public class CustomerInvoice {

	@Id
	String customerId;
	String addressId;
	String invoiceId;
	String invoiceType;
	String invoiceTypeLocalized;
	String paymentDueDate;
	int invoiceNumber;
	Date startDate, endDate;
	String periodDescription;
	double amount;
	double vatAmount;
	double totalAmount;

	protected CustomerInvoice(){}

	public CustomerInvoice(Invoice inv){
		this.customerId = inv.getCustomerId();
		this.addressId = inv.getAddressId();
		this.invoiceId = inv.getInvoiceId();
		this.invoiceType = inv.getInvoiceType();
		this.invoiceTypeLocalized = inv.getInvoiceTypeLocalized();
		this.paymentDueDate = inv.getPaymentDueDate();
		this.invoiceNumber = inv.getInvoiceNumber();

		this.startDate = HelperUtility.convertStringToDate(inv.getStartDate());
		this.endDate = HelperUtility.convertStringToDate(inv.getEndDate());

		this.periodDescription = inv.getPeriodDescription();
		this.amount = inv.getAmount();
		this.vatAmount = inv.getVatAmount();
		this.totalAmount = inv.getTotalAmount();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeLocalized() {
		return invoiceTypeLocalized;
	}

	public void setInvoiceTypeLocalized(String invoiceTypeLocalized) {
		this.invoiceTypeLocalized = invoiceTypeLocalized;
	}

	public String getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPeriodDescription() {
		return periodDescription;
	}

	public void setPeriodDescription(String periodDescription) {
		this.periodDescription = periodDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(double vatAmount) {
		this.vatAmount = vatAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
