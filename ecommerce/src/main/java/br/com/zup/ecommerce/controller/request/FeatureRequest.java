package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Feature;
import br.com.zup.ecommerce.entities.Product;

public class FeatureRequest {

	private String name;
	private String value;
	private Long productId;

	public FeatureRequest(String name, String value, Long productId) {
		this.name = name;
		this.value = value;
		this.productId = productId;
	}

	public Feature toFeature(Product product) {
		return new Feature(name, value, product);
	}

	public Feature toOnlyFeature() {
		return new Feature(name, value);
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public Long getProductId() {
		return productId;
	}

}
