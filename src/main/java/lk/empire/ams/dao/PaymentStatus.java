package lk.empire.ams.dao;

public enum  PaymentStatus {
    FullyComplete(0, "complete"),
    Pending(1, "pending");

    private final int id;
    private final String status;

    //Constructor
    private PaymentStatus(int id, String status){
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
