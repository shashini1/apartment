package lk.empire.ams.dto;

import lk.empire.ams.dao.User;
import lk.empire.ams.dao.UserRole;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigInteger;
import java.util.List;

public class UserDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private BigInteger contact1;
    private BigInteger contact2;
    private UserRoleDTO userRole;

    //** convert user dao to DTO classes using valueOf and copyProperties method  **//
    public static UserDTO valueOf(User user){
        // crate a new object
        UserDTO usertDTO = new UserDTO();
        BeanUtils.copyProperties(user, usertDTO);
        return usertDTO;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public UserRoleDTO getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRoleDTO userRole) {
        this.userRole = userRole;
    }
}
