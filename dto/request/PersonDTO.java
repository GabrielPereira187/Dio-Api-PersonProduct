package one.dio.dioapi.dto.request;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2,max = 12)
    private String name;

    @NotEmpty
    @Size(min = 2,max = 22)
    private String lastName;

    //@NotEmpty
    //@CPF
    //private String cpf;

    //private LocalDate birthDate;

    /*@Valid
    @NotEmpty
    private List<ProductDTO> products = new ArrayList<>();*/

    public String getLastName() {
        return lastName;
        }
        
        public void setLastName(String lastName) {
        this.lastName = lastName;
        }
        
        public String getName() {
        return name;
        }
        
        public void setName(String name) {
        this.name = name;
        }

    
}
