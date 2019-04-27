package lk.empire.ams.dao;

public enum InquiryStatus {
    Seen(0, "seen"),
    pending(1, "pending"),;

    private final int id;
    private final String name;

    private InquiryStatus(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
