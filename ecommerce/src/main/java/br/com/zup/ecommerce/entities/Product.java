package br.com.zup.ecommerce.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private BigDecimal value;
    
    @Column(nullable = false)
    private String quantity;
    
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
    
    @OneToOne
    private User user;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getQuantity() {
        return quantity;
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

    public User getUser() {
        return user;
    }
}
