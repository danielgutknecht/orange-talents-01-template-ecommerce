package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Category;
import br.com.zup.ecommerce.entities.Product;

public class CategoryRequest {

	private String name;
	private Long motherCategory;
	private Long productId;

	public CategoryRequest(String name, Long motherCategory, Long productId) {
		this.name = name;
		this.motherCategory = motherCategory;
		this.productId = productId;
	}

	public Category toCategory(Category category, Product product) {
		return new Category(name, category, product);
	}

	public String getName() {
		return name;
	}

	public Long getMotherCategory() {
		return motherCategory;
	}

	public Long getProductId() {
		return productId;
	}

}
