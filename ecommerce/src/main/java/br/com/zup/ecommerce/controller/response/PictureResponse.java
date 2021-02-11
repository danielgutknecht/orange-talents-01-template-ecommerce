package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.Picture;

public class PictureResponse {

	private Long id;
	private String link;
	private ProductResponse producResponse;

	public PictureResponse(Picture picture) {
		this.id = picture.getId();
		this.link = picture.getLink();
		this.producResponse = new ProductResponse(picture.getProduct());
	}

	public Long getId() {
		return id;
	}

	public String getLink() {
		return link;
	}

	public ProductResponse getProducResponse() {
		return producResponse;
	}

}
