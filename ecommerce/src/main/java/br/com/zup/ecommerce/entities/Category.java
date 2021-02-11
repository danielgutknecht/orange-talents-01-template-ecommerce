package br.com.zup.ecommerce.entities;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	private Category motherCategory;

	@OneToMany(mappedBy = "motherCategory")
	private Set<Category> children;

	@ManyToOne
	private Product product;

	public Category() {

	}

	public Category(String name, Category motherCategory, Product product) {
		this.name = name;
		this.motherCategory = motherCategory;
		this.product = product;
	}

	public void addChild(Category children) {
		this.children.add(children);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getMotherCategory() {
		return motherCategory;
	}

	public void setMotherCategory(Category motherCategory) {
		this.motherCategory = motherCategory;
	}

	public Set<Category> getChildren() {
		return children;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
