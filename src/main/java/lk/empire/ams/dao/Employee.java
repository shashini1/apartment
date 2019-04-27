package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.List;

@Entity(name = "Employee")
@DiscriminatorValue("Empoyee")

public class Employee extends User {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee")
    private List<Event> empEventList;

    @Size(max = 20)
    private String nic;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Inquiry> inquiryList;

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
//
//    public List<Inquiry> getInquiryList() {
//        return inquiryList;
//    }
//
//    public void setInquiryList(List<Inquiry> inquiryList) {
//        this.inquiryList = inquiryList;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "nic='" + nic + '\'' +
                '}';
    }
}
