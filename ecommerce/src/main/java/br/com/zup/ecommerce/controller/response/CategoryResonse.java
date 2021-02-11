package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.Category;

public class CategoryResonse {

	private Long id;
	private String name;
	private CategoryResonse motherCategory;

	public CategoryResonse(CategoryResonse motherCategory) {
		this.motherCategory = motherCategory;
	}

	public CategoryResonse(Category category) {
		this.id = category.getId();
		this.name = category.getName();
		// this.motherCategory = null;

		if (category.getMotherCategory() != null) {
			this.motherCategory = new CategoryResonse(category.getMotherCategory());
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public CategoryResonse getMotherCategory() {
		return motherCategory;
	}

}
