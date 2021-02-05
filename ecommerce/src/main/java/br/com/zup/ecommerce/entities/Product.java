package br.com.zup.ecommerce.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private BigDecimal price;
	
	@Column(nullable = false)
    private Integer amount;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@OneToOne
	private Category category;

	@OneToMany(mappedBy = "product")
	private Set<Picture> pictures = new HashSet<>();

	@OneToMany(mappedBy = "product")
	private Set<Feature> features = new HashSet<>();

	@OneToMany(mappedBy = "product")
	private Set<Question> question = new HashSet<>();

	@OneToMany(mappedBy = "product")
	private Set<Review> review = new HashSet<>();
	
	@OneToMany(mappedBy = "product")
	private Set<Purchase> purchase;
	
	@OneToOne
	private User user;
	
			
	public Product(String name, BigDecimal price, Integer amount, String description) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.description = description;
	}

	public Double averageReview() {
		return getReview().stream().mapToLong(Review::getRating).average().orElseThrow();
	}
	
	public Integer totalReview() {
		return getReview().stream().mapToInt(Review::getRating).sum();
	}
	
	public Integer sumAlmountProduct() {
		List<Product> qtd = new ArrayList<>();
		
		return qtd.stream().mapToInt(Product::getAmount).sum();	
	}
	
	public boolean addPicture(Picture picture) {
		return getPictures().add(picture);
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Category getCategory() {
		return category;
	}

	public Set<Picture> getPictures() {
		return pictures;
	}

	public Set<Feature> getFeatures() {
		return features;
	}

	public Set<Question> getQuestion() {
		return question;
	}

	public Set<Review> getReview() {
		return review;
	}

	public Set<Purchase> getPurchase() {
		return purchase;
	}

	public User getUser() {
		return user;
	}
	
	
}
