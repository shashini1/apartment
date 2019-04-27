package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity

public class Payment {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;


    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod pmethod;

    @NotNull
    private Date date;

    @Size(min = 0, max = 2000)
    private String description;

    private Date dueDate;

    private Date endDate;

    @Column
    @Size(min = 0)
    private Integer recurringInterval;

    @Size(min=0)
    private Double amount;

    @Size(min = 0)
    private Integer gracePeriod;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id")
    private Unit unit;

     //enum
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PaymentMethod getPmethod() {
        return pmethod;
    }

    public void setPmethod(PaymentMethod pmethod) {
        this.pmethod = pmethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRecurringInterval() {
        return recurringInterval;
    }

    public void setRecurringInterval(Integer recurringInterval) {
        this.recurringInterval = recurringInterval;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", pmethod=" + pmethod +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", endDate=" + endDate +
                ", recurringInterval=" + recurringInterval +
                ", amount=" + amount +
                ", gracePeriod=" + gracePeriod +
                ", unit=" + unit +
                ", status=" + status +
                '}';
    }
}
