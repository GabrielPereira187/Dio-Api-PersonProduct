package one.dio.dioapi.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.dio.dioapi.enums.ProductType;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @NotEmpty
    @Size(min = 4, max = 30)
    private String name;
    
}
