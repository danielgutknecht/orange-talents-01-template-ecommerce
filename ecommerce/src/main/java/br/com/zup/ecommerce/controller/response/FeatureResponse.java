package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.Feature;

public class FeatureResponse {

	private String name;
	private String value;
	private ProductResponse productResponse;

	public FeatureResponse(Feature feature) {
		this.name = feature.getName();
		this.value = feature.getValue();
		this.productResponse = new ProductResponse(feature.getProduct());
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public ProductResponse getProductResponse() {
		return productResponse;
	}

}
