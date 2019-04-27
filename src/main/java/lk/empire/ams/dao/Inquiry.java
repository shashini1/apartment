package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.Date;

@Entity

public class Inquiry {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int id;

    private Date openDate;

    private Date closeDate;

    @Column
    private String status;

    @Enumerated(EnumType.ORDINAL)
    private InquiryStatus action;

    @Size(max = 2000)
    private String description;

    @Lob
    private byte[] image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InquiryStatus getAction() {
        return action;
    }

    public void setAction(InquiryStatus action) {
        this.action = action;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Inquiry{" +
                "id=" + id +
                ", openDate=" + openDate +
                ", closeDate=" + closeDate +
                ", status='" + status + '\'' +
                ", action=" + action +
                ", description='" + description + '\'' +
                ", image=" + Arrays.toString(image) +
                ", client=" + client +
                ", employee=" + employee +
                '}';
    }
}
