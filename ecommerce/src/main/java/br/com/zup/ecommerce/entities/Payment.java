package br.com.zup.ecommerce.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Long transactionsOriginId;

	@Column(nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@ManyToOne
	private Purchase purchase;

	@Enumerated(EnumType.STRING)
	private PaymentStatus status;

	public Payment(Long transactionsOriginId, Purchase purchase, PaymentStatus status) {
		this.transactionsOriginId = transactionsOriginId;
		this.purchase = purchase;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public Long getTransactionsOriginId() {
		return transactionsOriginId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public PaymentStatus getStatus() {
		return status;
	}
}
