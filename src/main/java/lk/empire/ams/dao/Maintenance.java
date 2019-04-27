package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.Date;

@Entity

public class Maintenance {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Size(min = 3, max = 20)
    private String title;

    private Date startDate;

    private Date endDate;

    @Size(min = 0, max = 20)
    private String doneBy;

    @Enumerated(EnumType.ORDINAL)
    private MaintenanceStatus status;

    @Size(min = 0)
    private Long amount;

    @Size(min = 0, max = 2000)
    private String description;

    @Size(min = 20)
    private BigInteger contact1;

    @Size(min = 20)
    private BigInteger contact2;

    @ManyToOne(fetch = FetchType.EAGER)
    private Contractor contractor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "floor_id")
    private Floor floor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maintenace_id")
    private Maintenance maintenance;

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

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public MaintenanceStatus getStatus() {
        return status;
    }

    public void setStatus(MaintenanceStatus status) {
        this.status = status;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
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

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", doneBy='" + doneBy + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", contact1=" + contact1 +
                ", contact2=" + contact2 +
                ", contractor=" + contractor +
                ", floor=" + floor +
                ", apartment=" + apartment +
                ", maintenance=" + maintenance +
                '}';
    }
}
