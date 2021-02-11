package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Product;
import br.com.zup.ecommerce.entities.Review;
import br.com.zup.ecommerce.entities.User;

public class ReviewRequest {

	private Integer rating;
	private String title;
	private String description;
	private Long priductId;
	private Long userId;

	public ReviewRequest(Integer rating, String title, String description, Long priductId, Long userId) {
		this.rating = rating;
		this.title = title;
		this.description = description;
		this.priductId = priductId;
		this.userId = userId;
	}

	public Review toReview(Product product, User user) {
		return new Review(rating, title, description, product, user);
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

	public Long getPriductId() {
		return priductId;
	}

	public Long getUserId() {
		return userId;
	}

}
