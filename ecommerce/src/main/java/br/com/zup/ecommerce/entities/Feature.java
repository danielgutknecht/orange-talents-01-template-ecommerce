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
	private String value;

	@ManyToOne
	private Product product;

	public Feature(String name, String value, Product product) {
		this.name = name;
		this.value = value;
		this.product = product;
	}

	public Feature(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public Product getProduct() {
		return product;
	}

}
