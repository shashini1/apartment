package lk.empire.ams.dao;

import javax.persistence.*;

//enum for available

public enum Availability {
    Available(0, "Available"),
   Unavailable(1, "Available");
    private final int id;
    private final String status;


    Availability(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
