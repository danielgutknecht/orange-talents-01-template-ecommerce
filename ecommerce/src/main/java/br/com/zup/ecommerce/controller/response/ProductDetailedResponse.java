package br.com.zup.ecommerce.controller.response;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import br.com.zup.ecommerce.entities.Product;

public class ProductDetailedResponse {

	private Long id;
	private String name;
	private BigDecimal price;
	private Integer amount;
	private String description;
	private List<FeatureResponse> features;
	private CategoryResonse category;
	private List<PictureResponse> pictures;
	private List<ReviewResponse> reviews;
	private Integer totalReviews;
	private Double averageReviewNote;
	private List<QuestionResponse> questions;

	public ProductDetailedResponse(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.price = product.getPrice();
		this.amount = product.getAmount();
		this.description = product.getDescription();
		this.features = product.getFeatures().stream().map(FeatureResponse::new).collect(Collectors.toList());
		this.category = new CategoryResonse(product.getCategory());
		this.pictures = product.getPictures().stream().map(PictureResponse::new).collect(Collectors.toList());
		this.reviews = product.getReview().stream().map(ReviewResponse::new).collect(Collectors.toList());
		this.totalReviews = product.totalReview();
		this.averageReviewNote = product.averageReview();
		this.questions = product.getQuestion().stream().map(QuestionResponse::new).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public List<FeatureResponse> getFeatures() {
		return features;
	}

	public CategoryResonse getCategory() {
		return category;
	}

	public List<PictureResponse> getPictures() {
		return pictures;
	}

	public List<ReviewResponse> getReviews() {
		return reviews;
	}

	public Integer getTotalReviews() {
		return totalReviews;
	}

	public Double getAverageReviewNote() {
		return averageReviewNote;
	}

	public List<QuestionResponse> getQuestions() {
		return questions;
	}

}
