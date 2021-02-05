package br.com.zup.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import br.com.zup.ecommerce.entities.Purchase;

@Controller
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
