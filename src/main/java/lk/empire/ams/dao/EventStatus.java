package lk.empire.ams.dao;

public enum  EventStatus {
    Approve(0, "approve"),
    Disapprove(1, "disapprove");

    private final int id;
    private final String status;

    private EventStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

}
