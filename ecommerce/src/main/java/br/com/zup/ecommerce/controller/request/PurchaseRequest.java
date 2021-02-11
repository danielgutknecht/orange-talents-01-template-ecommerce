package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Product;
import br.com.zup.ecommerce.entities.Purchase;
import br.com.zup.ecommerce.entities.User;
import br.com.zup.ecommerce.provider.gateway.GatewayType;

public class PurchaseRequest {

	private Long productId;
	private Integer amount;
	private String paymentGateway;
	private Long userId;

	public PurchaseRequest(Long productId, Integer amount, String paymentGateway, Long userId) {
		this.productId = productId;
		this.amount = amount;
		this.paymentGateway = paymentGateway;
		this.userId = userId;
	}

	public Purchase toModel(GatewayType gatewayType, Product product, User user) {
		return new Purchase(amount, gatewayType, product, user);
	}

	public Long getProductId() {
		return productId;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getPaymentGateway() {
		return paymentGateway;
	}

	public Long getUserId() {
		return userId;
	}

}
