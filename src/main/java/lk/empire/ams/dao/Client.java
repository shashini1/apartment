package lk.empire.ams.dao;

import lk.empire.ams.dto.NotificationDTO;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity(name = "Client")
@DiscriminatorValue("Client")

public class Client extends User{

    @Size(min = 0, max=20)
    private String UserName;

    @Size(min = 0, max = 200)
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner")
    @Column(name = "owned_units")
    private Set<Unit> ownedUnits;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "renter")
    @Column(name = "rented_units")
    private Set<Unit> rentedUnits;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Notification> notificationList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private List<Event> eventList;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public Set<Unit> getOwnedUnits() {
        return ownedUnits;
    }

    public void setOwnedUnits(Set<Unit> ownedUnits) {
        this.ownedUnits = ownedUnits;
    }

    public Set<Unit> getRentedUnits() {
        return rentedUnits;
    }

    public void setRentedUnits(Set<Unit> rentedUnits) {
        this.rentedUnits = rentedUnits;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }



    @Override
    public String toString() {
        return "Client{" +
                "UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                ", ownedUnits=" + ownedUnits +
                ", rentedUnits=" + rentedUnits +
                ", notificationList=" + notificationList +
                ", eventList=" + eventList +
                '}';
    }
}
