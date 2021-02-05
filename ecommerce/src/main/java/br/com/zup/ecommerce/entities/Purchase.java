package br.com.zup.ecommerce.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer amount;
    
    @Enumerated(EnumType.STRING)
    private PurchaseStatus purchaseStatus;

    // Gateway  here !! private


    @ManyToOne
    private Product product;

    @OneToOne
    private User user;
    
    @OneToMany
    private Set<Payment> payments = new HashSet<Payment>();    
    


}
