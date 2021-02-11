package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Payment;
import br.com.zup.ecommerce.entities.PaymentStatus;
import br.com.zup.ecommerce.entities.Purchase;

public class PaymentRequest {

	private Long transactionsOriginId;
	private Long purchaseId;
	private PaymentStatus status;

	public PaymentRequest(Long purchaseId, Long transactionsOriginId, PaymentStatus status) {
		this.purchaseId = purchaseId;
		this.transactionsOriginId = transactionsOriginId;
		this.status = status;
	}

	public Payment toPayment(Purchase purchase, PaymentStatus status) {
		return new Payment(transactionsOriginId, purchase, status);
	}

	public Long getTransactionsOriginId() {
		return transactionsOriginId;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public PaymentStatus getStatus() {
		return status;
	}

}
