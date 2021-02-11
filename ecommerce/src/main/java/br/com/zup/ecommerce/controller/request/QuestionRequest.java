package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Product;
import br.com.zup.ecommerce.entities.Question;
import br.com.zup.ecommerce.entities.User;

public class QuestionRequest {

	private String title;
	private String description;
	private Long productId;
	private Long userId;

	public QuestionRequest(String title, String description, Long productId, Long userId) {
		this.title = title;
		this.description = description;
		this.productId = productId;
		this.userId = userId;
	}

	public Question toQuestion(Product product, User user) {
		return new Question(title, description, product, user);
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Long getProductId() {
		return productId;
	}

	public Long getUserId() {
		return userId;
	}

}
