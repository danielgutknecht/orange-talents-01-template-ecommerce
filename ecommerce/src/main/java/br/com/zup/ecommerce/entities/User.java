package br.com.zup.ecommerce.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String login;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@ManyToMany
	@JoinTable(name = "user_role", 
    joinColumns = @JoinColumn(name = "user_id"), 
    inverseJoinColumns = @JoinColumn(name = "group_id"))
	private Set<Role> roles = new HashSet<>();

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public boolean removeGroup(Role role) {
		return getRole().remove(role);
	}

	public boolean addGroup(Role role) {
		return getRole().add(role);
	}

	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Set<Role> getRole() {
		return roles;
	}

}
