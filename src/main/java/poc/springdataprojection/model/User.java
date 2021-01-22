package poc.springdataprojection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import poc.springdataprojection.enums.UserProfile;
import poc.springdataprojection.model.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class User extends BaseEntity {

    private String login;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserProfile profile;

    private Boolean active;

    @OneToOne
    private Person person;

}
