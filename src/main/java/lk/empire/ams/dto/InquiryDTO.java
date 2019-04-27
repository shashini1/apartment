package lk.empire.ams.dto;

import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class InquiryDTO {

    private int id;
    private LocalDate openDate;
    private LocalDate closedDate;
    private String description;
    private int clientId;
    private String clientName;
    private String nic;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public InquiryDTO getDTO(){
        InquiryDTO dto = new InquiryDTO();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    public void setDTO(InquiryDTO dto){
        if(dto == null) return;
        BeanUtils.copyProperties(dto, this);
    }
}
