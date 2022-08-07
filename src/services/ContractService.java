package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinepaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinepaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue()/months;
		for (int i = 1; i <= months; i++) {
			double updateQuota = basicQuota + onlinepaymentService.interest(basicQuota,i);
			//updateQuota = 202
			double fullQuota = updateQuota + onlinepaymentService.paymentFee(updateQuota);
			//fullQuota = 206.04
			Date dueDate = addMonths(contract.getDate(),i);
		    contract.getInstallments().add(new Installment(dueDate,fullQuota)); 
		    
		
		}

	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
