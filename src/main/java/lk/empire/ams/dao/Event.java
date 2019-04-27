package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;

@Entity(name = "ClientEvent")
public class Event {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    @Size(min = 10, max = 150)
    private String name;

    //enum
    @Enumerated(EnumType.ORDINAL)
    private EventStatus status;

    private Date date;

    @Size(min = 0, max = 20)
    @Column(name = "repeat_interval")
    private int repeat;

    @Size(min = 0, max = 20)
    private String eventType;

    @Size(min = 0, max = 200)
    private String allowedGroup;

    @Column
    private Date startTime;

    private Date endTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="events")
    private Apartment apartment;

    /// need clarify this

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_list")
    private Client user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emp_event_list")
    private Employee employee;

    @Size(min = 0, max = 2000)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAllowedGroup() {
        return allowedGroup;
    }

    public void setAllowedGroup(String allowedGroup) {
        this.allowedGroup = allowedGroup;
    }


    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", date=" + date +
                ", repeat=" + repeat +
                ", eventType='" + eventType + '\'' +
                ", allowedGroup='" + allowedGroup + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", apartment=" + apartment +
                ", user=" + user +
                ", description='" + description + '\'' +
                '}';
    }
}
