package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user")
public class User {

    @Column(name = "id", nullable = false, updatable = false)//  need to carify
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 3, max = 100)
    private String firstName;

    @Size(min = 3, max =100)
    private String lastName;

    @Size(min = 0, max = 100)
    private String email;

    @Size(min = 0, max = 100)
    private String addressLine1;

    @Size(min = 0, max = 100)
    private String addressLine2;

    @Size(min = 0, max = 10)
    private BigInteger contact1;

    @Size(min = 0, max = 10)
    private BigInteger contact2;

   @Enumerated(EnumType.ORDINAL)
   private UserRole userRole;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public BigInteger getContact1() {
        return contact1;
    }

    public void setContact1(BigInteger contact1) {
        this.contact1 = contact1;
    }

    public BigInteger getContact2() {
        return contact2;
    }

    public void setContact2(BigInteger contact2) {
        this.contact2 = contact2;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", contact1=" + contact1 +
                ", contact2=" + contact2 +
                ", userRole=" + userRole +
                '}';
    }
}
