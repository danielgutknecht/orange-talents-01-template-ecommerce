package br.com.zup.ecommerce.controller;

import br.com.zup.ecommerce.controller.request.CategoryRequest;
import br.com.zup.ecommerce.controller.response.CategoryResonse;
import br.com.zup.ecommerce.services.CategoryService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping
	public ResponseEntity<CategoryResonse> createCategory(@RequestBody @Valid CategoryRequest request) {

		return ResponseEntity.ok(service.createCategory(request));

	}

}
