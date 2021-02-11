package br.com.zup.ecommerce.controller.response;

import java.math.BigDecimal;

import br.com.zup.ecommerce.entities.Product;

public class ProductResponse {

	private Long id;
	private String name;
	private BigDecimal price;
	private Integer amount;
	private String description;

	public ProductResponse(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.price = product.getPrice();
		this.amount = product.getAmount();
		this.description = product.getDescription();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

}
