package lk.empire.ams.dto;

import lk.empire.ams.dao.Client;
import lk.empire.ams.dao.Unit;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClientDTO {

    private int id;
    private String password;
    private List<String> ownedUnitNames;
    private List<String> rentedUnitNames;
    private int unitID;
    private String unitName;

    public List<String> getOwnedUnitNames() {
        return ownedUnitNames;
    }

    public void setOwnedUnitNames(List<String> ownedUnitNames) {
        this.ownedUnitNames = ownedUnitNames;
    }

    public List<String> getRentedUnitNames() {
        return rentedUnitNames;
    }

    public void setRentedUnitNames(List<String> rentedUnitNames) {
        this.rentedUnitNames = rentedUnitNames;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    //** convert client DAO to DTO classes using valueOf and copyProperties method  **//
    public static ClientDTO valueOf(Client client){
        // crate a new object
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client, clientDTO);
        Set<Unit> ownedUnits = client.getOwnedUnits();
        List<String> ownedUnitNames = new ArrayList<>();
        List<String> rentedUnitNames = new ArrayList<>();
        Set<Unit> rentedUnits = client.getOwnedUnits();
       if(ownedUnitNames != null && ownedUnitNames.size() > 0) {
           for (Unit unit : ownedUnits) {
               if (unit != null && !StringUtils.isEmpty(unit.getName())) ownedUnitNames.add(unit.getName());
           }
       }

        if(rentedUnits != null && rentedUnits.size() > 0) {
            for (Unit unit : rentedUnits) {
                if (unit != null && !StringUtils.isEmpty(unit.getName())) rentedUnitNames.add(unit.getName());
            }
        }

        clientDTO.setOwnedUnitNames(ownedUnitNames);
        clientDTO.setRentedUnitNames(rentedUnitNames);

        return clientDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
