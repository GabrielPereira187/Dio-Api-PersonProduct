package one.dio.dioapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.dio.dioapi.enums.ProductType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Enumerated(EnumType.STRING)
    //@Column(nullable = false)
    //private ProductType type;
    @Column(nullable = false)
    private String name;

    
    public String getName() {
    return name;
    }
    
    public void setName(String name) {
    this.name = name;
    }

}
