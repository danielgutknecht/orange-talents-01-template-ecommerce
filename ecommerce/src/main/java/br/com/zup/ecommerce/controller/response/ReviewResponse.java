package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.Review;

public class ReviewResponse {

	private Integer rating;
	private String title;
	private String description;
	private ProductResponse productResponse;
	private UserResponse userResponse;

	public ReviewResponse(Review review) {
		this.rating = review.getRating();
		this.title = review.getTitle();
		this.description = review.getDescription();
		this.productResponse = new ProductResponse(review.getProduct());
		this.userResponse = new UserResponse(review.getUser());
	}

	public Integer getRating() {
		return rating;
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
