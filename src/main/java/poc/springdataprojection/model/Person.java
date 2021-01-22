package poc.springdataprojection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import poc.springdataprojection.model.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Person extends BaseEntity {

    private String name;

    private String cpf;

    @OneToOne(mappedBy = "person")
    private User user;

}
