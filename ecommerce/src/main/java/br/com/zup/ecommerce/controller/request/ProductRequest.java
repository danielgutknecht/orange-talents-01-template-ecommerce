package br.com.zup.ecommerce.controller.request;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import br.com.zup.ecommerce.entities.Category;
import br.com.zup.ecommerce.entities.Product;
import br.com.zup.ecommerce.entities.User;

public class ProductRequest {

	private String name;
	private BigDecimal price;
	private Integer amount;
	private String description;
	private List<FeatureRequest> features;
	private String categoryName;

	public ProductRequest(String name, BigDecimal price, Integer amount, String description,
			List<FeatureRequest> features, String categoryName) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.description = description;
		this.features = features;
		this.categoryName = categoryName;
	}

	public Product toProduct(Category category, User user) {
		return new Product(name, price, amount, description, category,
				features.stream().map(FeatureRequest::toOnlyFeature).collect(Collectors.toList()), user);
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

	public List<FeatureRequest> getFeatures() {
		return features;
	}

	public String getCategoryName() {
		return categoryName;
	}

}
