package br.com.zup.ecommerce.entities;

import javax.persistence.*;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer rating;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String description;

	@ManyToOne()
	private Product product;

	@ManyToOne()
	private User user;

	public Review(Integer rating, String title, String description, Product product, User user) {

		this.rating = rating;
		this.title = title;
		this.description = description;
		this.product = product;
		this.user = user;
	}

	public Long getId() {
		return id;
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

	public Product getProduct() {
		return product;
	}

	public User getUser() {
		return user;
	}
}
