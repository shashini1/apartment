package lk.empire.ams.dao;

//Type of UserRoles

public enum UserRole {
    tenant(0, "Tenant"),
    owner(1, "owner");

    private final int id;
    private final  String name;


    UserRole(int id, String name) {
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
