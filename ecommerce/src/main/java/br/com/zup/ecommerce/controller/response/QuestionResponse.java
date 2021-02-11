package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.Question;

public class QuestionResponse {

	private String title;
	private String description;
	private ProductResponse productResponse;
	private UserResponse userResponse;

	public QuestionResponse(Question question) {
		this.title = question.getTitle();
		this.description = question.getDescription();
		this.productResponse = new ProductResponse(question.getProduct());
		this.userResponse = new UserResponse(question.getUser());
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public ProductResponse getProductResponse() {
		return productResponse;
	}

	public UserResponse getUserResponse() {
		return userResponse;
	}

}
