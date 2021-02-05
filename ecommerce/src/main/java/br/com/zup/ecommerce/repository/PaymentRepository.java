package br.com.zup.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.ecommerce.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
