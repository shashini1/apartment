package lk.empire.ams.dao;

public enum MaintenanceStatus {
    Pending(0, "pending"),
    Ongoing(1, "ongoing"),
    Done(2, "done");

    private final int id;
    private final String name;

    private MaintenanceStatus(int id, String name){
        this.id = id;
        this.name = name;
    }
}
