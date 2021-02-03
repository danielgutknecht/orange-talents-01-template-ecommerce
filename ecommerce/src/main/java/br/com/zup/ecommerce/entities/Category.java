package br.com.zup.ecommerce.entities;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;

    @OneToOne
    private Category motherCategory;

    public Category(String name, Category motherCategory) {
        this.name = name;
        this.motherCategory = motherCategory;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getMotherCategory() {
        return motherCategory;
    }
}
