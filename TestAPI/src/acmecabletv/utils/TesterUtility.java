package acmecabletv.utils;

import acmecabletv.Invoice;

public class TesterUtility {

	public static Invoice buildMockInvoiceObj(int idx){
		Invoice inv = new Invoice();

		if(idx == 0){
			inv.setCustomerId("1");
			inv.setAddressId("8212BJ154");
			inv.setInvoiceId("70ec3a54a43d014aa9e8");
			inv.setInvoiceType("AdvancePayment");
			inv.setInvoiceTypeLocalized("Voorschot");
			inv.setPaymentDueDate("2015-02-13T00:00:00");
			inv.setInvoiceNumber(157005888);
			inv.setPeriodDescription("Maart 2015");
			inv.setStartDate("2015-03-01T00:00:00");
			inv.setEndDate("2015-04-01T00:00:00");
			inv.setPeriodDescription("Maart 2015");
			inv.setAmount(165.29);
			inv.setVatAmount(34.71);
			inv.setTotalAmount(200);
		}
		else if (idx == 1){
			inv.setCustomerId("1");
			inv.setAddressId("8212BJ155");
			inv.setInvoiceId("ef7bf8999a");
			inv.setInvoiceType("AdvancePayment");
			inv.setInvoiceTypeLocalized("Voorschot");
			inv.setPaymentDueDate("2014-02-13T00:00:00");
			inv.setInvoiceNumber(1429564);
			inv.setPeriodDescription("Maart 2015");
			inv.setStartDate("2014-12-01T00:00:00");
			inv.setEndDate("2015-01-01T00:00:00");
			inv.setPeriodDescription("Maart 2015");
			inv.setAmount(155.29);
			inv.setVatAmount(30.71);
			inv.setTotalAmount(187);
		}else {
			inv.setCustomerId("1");
			inv.setAddressId("8212BJ155");
			inv.setInvoiceId("ef7bf88a");
			inv.setInvoiceType("ShopPurchase");
			inv.setInvoiceTypeLocalized("Winkel aankoop");
			inv.setPaymentDueDate("2014-11-13T00:00:00");
			inv.setInvoiceNumber(1429564);
			inv.setPeriodDescription("Maart 2015");
			inv.setStartDate("2014-12-01T00:00:00");
			inv.setEndDate("2015-01-01T00:00:00");
			inv.setPeriodDescription("Maart 2015");
			inv.setAmount(155.29);
			inv.setVatAmount(30.71);
			inv.setTotalAmount(187);
		}

		return inv;
	}

}
