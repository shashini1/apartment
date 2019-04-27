package lk.empire.ams.dto;

import lk.empire.ams.dao.UserRole;
import org.springframework.beans.BeanUtils;

public class UserRoleDTO {

    private int id;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static UserRoleDTO valueOf(UserRole userRole){
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        BeanUtils.copyProperties(userRole, userRoleDTO);
        return userRoleDTO;
    }
}
