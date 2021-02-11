package br.com.zup.ecommerce.controller.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {

	@JsonProperty
    @NotBlank
	@Email
	private String login;
	
	@JsonProperty
    @NotBlank
	@Size(min = 6)
	private String password;

	public LoginRequest(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

}
