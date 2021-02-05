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
	
	
	public Question(String title, String description, LocalDateTime createdAt) {
		super();
		this.title = title;
		this.description = description;
		this.createdAt = createdAt;
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

}