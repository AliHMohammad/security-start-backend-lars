package dat3.security_demo.entity;

import dat3.security.entity.UserWithRoles;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//-------------
@Entity
public class SpecialUser extends UserWithRoles {
    //Bemærk at vi ikke tilføjer et @Id her i vores nye entitet,
    //som har flere properties (city, first, lastName osv)
    //ID'et er stadig userName, som stammer fra super-class (UserWithRoles)
    //Der er dog stadig behov for at oprette et særskilt repo-lag for denne nye entitet

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;

    public SpecialUser(String username, String email, String password, String firstName, String lastName, String address, String city, String zipCode) {
        super(username, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }
}

