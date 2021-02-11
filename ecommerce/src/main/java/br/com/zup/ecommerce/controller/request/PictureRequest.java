package br.com.zup.ecommerce.controller.request;

import br.com.zup.ecommerce.entities.Picture;
import br.com.zup.ecommerce.entities.Product;

public class PictureRequest {

	private Long productId;
	private String link;

	public PictureRequest(Long productId, String link) {
		this.productId = productId;
		this.link = link;
	}

	public Picture toPicture(Product product, String link) {
		return new Picture(product, link);
	}

	public Long getProductId() {
		return productId;
	}

	public String getLink() {
		return link;
	}

}
