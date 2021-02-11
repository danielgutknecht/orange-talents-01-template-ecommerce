package br.com.zup.ecommerce.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import br.com.zup.ecommerce.provider.gateway.GatewayType;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer amount;

	@Enumerated(EnumType.STRING)
	private GatewayType gatewayType;

	@Enumerated(EnumType.STRING)
	private PurchaseStatus purchaseStatus = PurchaseStatus.BEGINIG;

	@ManyToOne
	private Product product;

	@OneToOne
	private User user;

	@OneToMany(mappedBy = "purchase")
	private Set<Payment> payments = new HashSet<>();

	public Purchase() {
	}

	public Purchase(Integer amount, GatewayType gatewayType, Product product, User user) {
		this.amount = amount;
		this.gatewayType = gatewayType;
		this.product = product;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public Integer getAmount() {
		return amount;
	}

	public GatewayType getGatewayType() {
		return gatewayType;
	}

	public PurchaseStatus getPurchaseStatus() {
		return purchaseStatus;
	}

	public Product getProduct() {
		return product;
	}

	public User getUser() {
		return user;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	@Override
	public String toString() {
		return "Purchase [amount=" + amount + ", gatewayType=" + gatewayType + ", purchaseStatus=" + purchaseStatus
				+ ", product=" + product + ", user=" + user + "]";
	}

}
