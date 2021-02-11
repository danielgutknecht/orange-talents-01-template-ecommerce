package br.com.zup.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.zup.ecommerce.controller.request.CategoryRequest;
import br.com.zup.ecommerce.controller.response.CategoryResonse;
import br.com.zup.ecommerce.entities.Category;
import br.com.zup.ecommerce.entities.Product;
import br.com.zup.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository repository;

	public CategoryResonse createCategory(CategoryRequest request) {

		Optional<Category> motherCategoryId = repository.findById(request.getMotherCategory());

		System.out.println(motherCategoryId);

		Category category = new Category();

		if (!motherCategoryId.isPresent()) {
			category.setName(request.getName());
	
		} else {
			category.setName(request.getName());
			category.setMotherCategory(motherCategoryId.get());
		}

		repository.save(category);

		return new CategoryResonse(category);

	}

}
