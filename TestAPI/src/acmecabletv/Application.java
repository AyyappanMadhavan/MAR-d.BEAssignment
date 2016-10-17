package acmecabletv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import acmecabletv.datalayer.CustomerInvoice;
import acmecabletv.datalayer.InvioceRepository;
import acmecabletv.utils.TesterUtility;

@SpringBootApplication
public class Application{

	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class,args);
	 }


	//Tester methods
	@Bean
	public CommandLineRunner demo(InvioceRepository repository) {
		return (args) -> {
			// save invoices for test
			Invoice inv = TesterUtility.buildMockInvoiceObj(0);
			repository.save(new CustomerInvoice(inv));

			inv = TesterUtility.buildMockInvoiceObj(1);
			repository.save(new CustomerInvoice(inv));

			inv = TesterUtility.buildMockInvoiceObj(2);
			repository.save(new CustomerInvoice(inv));

			// fetch all customers
			System.out.println("Customers found with findAll():");
			System.out.println("-------------------------------");
			for (CustomerInvoice customerinv : repository.findAll()) {
				System.out.println(customerinv);
			}
			System.out.println("");

			// fetch an individual customerinv by customer ID
			CustomerInvoice customerinv = repository.findOne(1L);
			System.out.println("Customer found with findOne(1L):");
			System.out.println("--------------------------------");
			System.out.println(customerinv.toString());
			System.out.println("");

		};
	}
}
