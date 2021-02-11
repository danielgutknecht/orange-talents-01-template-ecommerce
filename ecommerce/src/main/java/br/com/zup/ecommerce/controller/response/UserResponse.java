package br.com.zup.ecommerce.controller.response;

import br.com.zup.ecommerce.entities.User;

public class UserResponse {

	private Long id;
	private String login;

	public UserResponse(User user) {
		this.id = user.getId();
		this.login = user.getLogin();
	}

	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

}
