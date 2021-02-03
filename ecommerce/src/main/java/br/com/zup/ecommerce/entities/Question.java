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

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Product product;

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