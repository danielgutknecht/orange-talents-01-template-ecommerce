package br.com.zup.ecommerce.entities;

import javax.persistence.*;

@Entity
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String description;
    
    @ManyToOne
    private Product product;    
    
    public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Product getProduct() {
        return product;
    }
}
