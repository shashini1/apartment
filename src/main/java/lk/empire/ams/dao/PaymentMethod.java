package lk.empire.ams.dao;

public enum PaymentMethod {
    cash(1, "cash"),
    debitcard(2, "debitcard"),
    creditcard(3, "credtcard"),
    cheque(4, "cheque"),
    bankTranfer(5, "bankTransfer"),
    Other(6, "other");

    private final int id;

    private final String pname;

    PaymentMethod(int id, String pname){
        this.id = id;
        this.pname = pname;
    }

    public int getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }
}
