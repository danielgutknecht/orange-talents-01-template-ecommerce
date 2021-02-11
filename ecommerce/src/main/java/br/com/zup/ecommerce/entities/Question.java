package br.com.zup.ecommerce.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@ManyToOne()
	private Product product;

	@OneToOne
	private User user;

	public Question(String title, String description, Product product, User user) {
		this.title = title;
		this.description = description;
		this.product = product;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Product getProduct() {
		return product;
	}

	public User getUser() {
		return user;
	}

}