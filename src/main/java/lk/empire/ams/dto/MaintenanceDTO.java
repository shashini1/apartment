package lk.empire.ams.dto;

import lk.empire.ams.dao.Maintenance;
import org.springframework.beans.BeanUtils;

import java.math.BigInteger;
import java.time.LocalDate;

public class MaintenanceDTO {

    private int id;
    private String title;
    private ContractorsDTO contractors;
    private String doneBy;
    private LocalDate startDate;
    private LocalDate endDate;
    private int blockId;
    private String blockName;
    private Double amount;
    private int floorId;
    private String floorName;
    private String description;
    private BigInteger contact1;
    private BigInteger contact2;

    // convert maintenace DAO to DTO classes using valueOf and copyProperties method  ////
    public static MaintenanceDTO valueOf(Maintenance maintenance){
        MaintenanceDTO maintenanceDTO = new MaintenanceDTO();
        BeanUtils.copyProperties(maintenance, maintenanceDTO);
        return maintenanceDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContractorsDTO getContractors() {
        return contractors;
    }

    public void setContractors(ContractorsDTO contractors) {
        this.contractors = contractors;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
