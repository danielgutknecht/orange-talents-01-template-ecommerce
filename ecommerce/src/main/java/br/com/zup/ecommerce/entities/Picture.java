package br.com.zup.ecommerce.entities;

import javax.persistence.*;


@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String link;
    
    @ManyToOne()
    private Product product;

    public Picture(Product product, String link) {
        this.product = product;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public Product getProduct() {
        return product;
    }
}
